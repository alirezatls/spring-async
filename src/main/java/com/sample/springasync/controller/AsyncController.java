package com.sample.springasync.controller;

import com.sample.springasync.domain.Article;
import com.sample.springasync.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
public class AsyncController {

    private ArticleRepository repository;

    @Autowired
    public AsyncController(ArticleRepository repository) {
        this.repository = repository;
    }

    @Async
    @PostMapping("/api/article")
    public CompletableFuture<ArticleResult> postArticleAsync(@RequestBody ArticleRequest request) {
        Article article = ArticleMapper.map(request);
        String id = repository.save(article).getId();
        return CompletableFuture.completedFuture(new ArticleResult(id));
    }


    @GetMapping("/api/article/{title}")
    public CompletableFuture<List<Article>> getAllByTitle(@PathVariable String title) {
        return repository.findAllByTitle(title);
    }

}
