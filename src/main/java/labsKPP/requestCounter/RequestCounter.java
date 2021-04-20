package labsKPP.requestCounter;

import java.util.concurrent.atomic.AtomicInteger;

public class RequestCounter {
    private static final AtomicInteger hitsCounter = new AtomicInteger();

    public static Integer get() {
        return hitsCounter.get();
    }

    public static void add() {
        hitsCounter.incrementAndGet();
    }
}
