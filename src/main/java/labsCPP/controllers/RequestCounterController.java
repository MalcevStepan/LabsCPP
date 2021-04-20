package labsKPP.controllers;

import labsKPP.requestCounter.RequestCounter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestCounterController {
    @GetMapping("/requestCount")
    public int getCount() {
        return RequestCounter.get();
    }
}
