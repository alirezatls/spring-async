package com.sample.springasync.controller;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
class ArticleRequest {
    private String name;
    private String title;
    private String author;
}
