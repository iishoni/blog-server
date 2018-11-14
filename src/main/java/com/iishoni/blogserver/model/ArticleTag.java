package com.iishoni.blogserver.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleTag {
    private Long id;
    //文章id
    private Long articleId;
    //标签id
    private Long tagId;
}
