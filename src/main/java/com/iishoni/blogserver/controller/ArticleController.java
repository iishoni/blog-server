package com.iishoni.blogserver.controller;

import com.iishoni.blogserver.model.Article;
import com.iishoni.blogserver.service.ArticleService;
import com.iishoni.web.view.Page;
import com.iishoni.web.view.ResponseVo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public ResponseVo<Page<Article>> getArticleByPage(@RequestParam Long pageNum) {
        Integer pageSize = 9;
        Page<Article> result = articleService.getArticleByPage(pageNum, pageSize);
        return new ResponseVo<>(result);
    }

    @GetMapping("/{articleId}")
    public ResponseVo<Article> getArticleById(@PathVariable Long articleId) {
        Article result = articleService.getArticleById(articleId);
        return new ResponseVo<>(result);
    }

    @PutMapping("/{articleId}")
    public ResponseVo updateArticle(@PathVariable Long articleId, @RequestBody String content) {
        articleService.updateArticle(articleId, content);
        return new ResponseVo<>();
    }

    @PostMapping("")
    public ResponseVo saveArticle(@RequestBody String content) {
        articleService.saveArticle(content);
        return new ResponseVo<>();
    }
}
