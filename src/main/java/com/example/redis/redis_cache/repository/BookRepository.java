package com.example.redis.redis_cache.repository;
import com.example.redis.redis_cache.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}

