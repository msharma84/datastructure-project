package multithreading.rateLimiter;

public interface RateLimiter {

    Boolean allowRequest(String userId);
}
