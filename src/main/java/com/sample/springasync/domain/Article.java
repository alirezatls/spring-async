package com.sample.springasync.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@Builder
public class Article {
    @Id
    private String id;
    private String name;
    private String title;
    private Date creationDate;
    private String author;
}
