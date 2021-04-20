package labsKPP.services;

import labsKPP.classFields.PrimeFields;
import labsKPP.primeDTO.PrimeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BulkOperationService {
    @Autowired
    PrimeService primeService;

    public List<PrimeFields> bulkCalculation(List<PrimeDTO> primeDTOS) {
        return primeDTOS
                .stream()
                .map(x -> primeService.calculatePrimeCheck(x.getValue()))
                .collect(Collectors.toList());
    }
}
