package com.sample.springasync.controller;

public class ArticleResult {
    private String articleId;

    public ArticleResult(String articleId) {
        this.articleId = articleId;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }
}
