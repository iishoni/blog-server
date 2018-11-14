package com.iishoni.blogserver.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    private Long id;
    //点赞量
    private Integer loves;
    //浏览量
    private Integer views;
    //作者
    private Long author;
    //内容
    private String content;
    //预览图
    private String img;
    //简述
    private String summary;
    //标题
    private String title;
    //发表时间
    private Date publishTime;
}
