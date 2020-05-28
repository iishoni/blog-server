package com.iishoni.blogserver.web.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleVo {
    private Long id;
    private String img;
    private String title;
    private String summary;
    private List<String> tags;
    private Integer loves;
    private Integer views;
}
