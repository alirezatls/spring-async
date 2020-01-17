package com.sample.springasync.controller;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
class ArticleResponse {
    private String id;
    private String name;
    private String title;
    private Date creationDate;
    private String author;
}
