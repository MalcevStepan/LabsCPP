package labsKPP.services;

import lombok.extern.slf4j.Slf4j;
import labsKPP.cashe.Cache;
import labsKPP.classFields.PrimeFields;
import labsKPP.controllers.Controller;
import labsKPP.primeDTO.PrimeDTO;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
@Slf4j
public class PrimeService {
    private static final Logger logger = Logger.getLogger(String.valueOf(Controller.class));
    private static Cache cache;
    public Cache getCache() {
        return cache;
    }

    public static PrimeFields calculatePrimeCheck(int value) {
        RequestCounter.add():
        String answer;
        PrimeDTO primeDTO=new PrimeDTO(value);
        if (cache.getAnsw(primeDTO)!=null){
            answer=cache.getAnsw(primeDTO);
        }
        else{
            logger.info("Calculating...");
            if (value % 2 == 0) {
                answer="Yes";
                cache.putAnsw(primeDTO,answer);
            }
            else{
                for (int i = 2; i < Math.sqrt(value); ++i) {
                    if (value % i == 0) {
                        answer="No" ;
                        cache.putAnsw(primeDTO,answer);
                    }
                }
            }
        }
        PrimeFields prime_fields=new PrimeFields(value,"No","Yes");
        logger.info(String.format("Collision result: %d", prime_fields.getEvenValueAnswer())+" "+prime_fields.getSimpleValueAnswer());
        return prime_fields;
    }
}





