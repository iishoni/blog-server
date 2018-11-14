package com.iishoni.blogserver.service;

import com.iishoni.blogserver.mapper.ArticleMapper;
import com.iishoni.blogserver.model.Article;
import com.iishoni.web.view.Page;

import org.beetl.sql.core.engine.PageQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ArticleService {

    @Resource
    private ArticleMapper articleMapper;

    /**
     * 获取文章列表（分页）
     */
    public Page<Article> getArticleByPage(long pageNum, long pageSize) {
        PageQuery<Article> query = new PageQuery<>(pageNum, pageSize);
        articleMapper.templatePage(query);
        return new Page<>(query.getList(), query.getTotalRow());
    }

    /**
     * 获取文章详情
     */
    public Article getArticleById(Long articleId) {
        return articleMapper.single(articleId);
    }
}
