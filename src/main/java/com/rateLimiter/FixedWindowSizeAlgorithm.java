package multithreading.rateLimiter;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class FixedWindowSizeAlgorithm implements RateLimiter{

    private Long limit;
    private Long windowsize;
    private ConcurrentHashMap<String,Long> windowStartTime;
    private ConcurrentHashMap<String, AtomicInteger> requestCounts;

    public FixedWindowSizeAlgorithm(Long limit,
            ConcurrentHashMap<String, AtomicInteger> requestCounts,
            ConcurrentHashMap<String, Long> windowStartTime,
            Long windowsize) {
        this.limit = limit;
        this.requestCounts = requestCounts;
        this.windowStartTime = windowStartTime;
        this.windowsize = windowsize;
    }

    @Override
    public Boolean allowRequest(String userId) {

        Boolean flag = false;

        Long currentTime = System.currentTimeMillis();
        windowStartTime.putIfAbsent(userId,currentTime);
        requestCounts.putIfAbsent(userId,new AtomicInteger(0));

        if(currentTime-windowStartTime.get(userId) > windowsize){
            windowStartTime.put(userId,currentTime);
            requestCounts.put(userId,new AtomicInteger(1));
            flag =  true;
        }else{
            if(requestCounts.get(userId).incrementAndGet() < limit){
                flag = true;
            }
        }
        System.out.println("Current User - "+userId + " request count- "+requestCounts.get(userId));
        return flag;
    }
}
