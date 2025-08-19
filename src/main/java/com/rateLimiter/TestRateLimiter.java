package multithreading.rateLimiter;

import java.util.concurrent.ConcurrentHashMap;

public class TestRateLimiter {

    public static void main(String[] args) {

        RateLimiter fixedWindow = new FixedWindowSizeAlgorithm(10L
                                    ,new ConcurrentHashMap<>()
                                    ,new ConcurrentHashMap<>()
                                    ,1L);
        String userId = "msharma";
        for(int i =0 ; i < 20 ; i++){
            /*try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception occurred !!!");
                Thread.interrupted();
            }*/
            System.out.println(userId + " can request api call - "+ fixedWindow.allowRequest(userId));
        }
    }
}
