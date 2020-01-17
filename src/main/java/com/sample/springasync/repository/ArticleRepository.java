package com.sample.springasync.repository;

import com.sample.springasync.domain.Article;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.scheduling.annotation.Async;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ArticleRepository extends MongoRepository<Article,String> {

    @Async
    CompletableFuture<List<Article>> findAllByTitle(String title);
}
