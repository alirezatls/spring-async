package com.sample.springasync.controller;

import com.sample.springasync.domain.Article;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

class ArticleMapper {
    static Article map(ArticleRequest request) {
        return Article.builder()
                .name(request.getName())
                .title(request.getTitle())
                .creationDate(new Date())
                .author(request.getAuthor())
                .build();
    }

    private ArticleResponse map(Article article) {
        return ArticleResponse.builder()
                .id(article.getId())
                .creationDate(article.getCreationDate())
                .author(article.getAuthor())
                .title(article.getTitle())
                .name(article.getName())
                .build();
    }

    public List<ArticleResponse> map(List<Article> articles) {
        return articles.stream()
                .map(this::map)
                .collect(Collectors.toList());
    }
}
