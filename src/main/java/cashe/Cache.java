package labsKPP.cashe;

import labsKPP.controllers.Controller;
import labsKPP.primeDTO.PrimeDTO;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

@Component
public class Cache {


    private static final Logger logger = Logger.getLogger(String.valueOf(Controller.class));
    private final Map<PrimeDTO, String> resultMAP = new HashMap<>();

    public Set<PrimeDTO> getQueries() {
        return resultMAP.keySet();
    }

    public void clear() {
        resultMAP.clear();
    }

    public String getAnsw(PrimeDTO primeDTO) {
        String result = resultMAP.get(primeDTO);
        if (result != null) {
            logger.info("RECEIVED FROM CACHE" + " " + result);
        }
        return result;
    }


    public void putAnsw(PrimeDTO primeDTO, String result) {
        logger.info("PUT IN CACHE... " + " " + result);
        resultMAP.put(primeDTO, result);

    }
}
