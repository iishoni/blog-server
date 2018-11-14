package com.iishoni.blogserver.controller;

import com.iishoni.blogserver.model.Article;
import com.iishoni.blogserver.service.ArticleService;
import com.iishoni.web.view.Page;
import com.iishoni.web.view.ResponseVo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Resource
    private ArticleService articleService;

    @GetMapping("")
    public ResponseVo<Page<Article>> getAdminListByPage(@RequestParam Long pageNum) {
        Integer pageSize = 9;
        Page<Article> result = articleService.getArticleByPage(pageNum, pageSize);
        return new ResponseVo<>(result);
    }

    @GetMapping("/{articleId}")
    public ResponseVo<Article> getAdminById(@PathVariable Long articleId) {
        Article result = articleService.getArticleById(articleId);
        return new ResponseVo<>(result);
    }
}
