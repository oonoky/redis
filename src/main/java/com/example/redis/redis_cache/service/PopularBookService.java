package com.example.redis.redis_cache.service;

import org.springframework.stereotype.Service;
import org.springframework.data.redis.core.ZSetOperations;
import java.util.Set;

@Service
public class PopularBookService {
    private final ZSetOperations<String, String> zSetOperations;

    public PopularBookService(ZSetOperations<String, String> zSetOperations) {
        this.zSetOperations = zSetOperations;
    }

    public void incrementPopularity(Long bookId) {
        zSetOperations.incrementScore("popular_books", bookId.toString(), 1);
    }

    public Set<String> getPopularBooks() {
        return zSetOperations.reverseRange("popular_books", 0, 9); // Top 10
    }
}
