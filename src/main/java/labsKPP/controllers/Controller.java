package labsKPP.controllers;


import labsKPP.cashe.Cache;
import labsKPP.entityes.ResultEntity;
import labsKPP.exceptionsHandling.ValidateExceptions;
import labsKPP.jpaRepos.ResultRepository;
import labsKPP.primeDTO.PrimeDTO;
import labsKPP.services.BulkOperationService;
import labsKPP.services.PrimeService;
import labsKPP.classFields.PrimeFields;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class Controller {
    private static final Logger logger = Logger.getLogger(String.valueOf(Controller.class));
    @Autowired
    PrimeService classesService;
    @Autowired
    BulkOperationService bulkOperationService;
    @Autowired
    ResultRepository resultRepository;
    @PostMapping("/bulk")
    public ResponseEntity bulkAnswer(@RequestBody List<PrimeDTO> primeDTOList) {
        return ResponseEntity.ok(bulkOperationService.bulkCalculation(primeDTOList));
    }

    @GetMapping("/getAnswers")
    public List<ResultEntity> getRes(){
        return resultRepository.findAll();
    }

    @PostMapping("/putAnswers")
    public void createEmployee() {
        int id = 0;
        Cache cache =classesService.getCache();
        for (PrimeDTO prm : cache.getQueries()) {
            ResultEntity entity = new ResultEntity();
            entity.setAnswerId(id++);
            entity.setEvenValueAnswer(cache.getAnsw(prm));
            entity.setSimpleValueAnswer(cache.getAnsw(prm));
            resultRepository.save(entity);
        }
        cache.clear();
    }
    @GetMapping("/prime")
    public ResponseEntity calculatePrimeCheck(

            @RequestParam(name = "value") int value
    ) throws ValidateExceptions {
        PrimeFields prime_fields = PrimeService.calculatePrimeCheck(value);
        if (value < 0) {
            logger.info("Value must be greater than zero!");
            throw new ValidateExceptions();
        }
        if (value > 1000) {
            logger.info("We don't work with such large numbers :)");
            throw new RuntimeException();
        }
        return ResponseEntity.ok(prime_fields);
    }
}