package com.iishoni.blogserver.web.controller;

import com.iishoni.blogserver.model.Tag;
import com.iishoni.blogserver.service.TagService;
import com.iishoni.web.view.ResponseVo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.annotation.Resource;

@RestController
@RequestMapping("/tag")
public class TagController {

    @Resource
    private TagService tagService;

    @GetMapping("")
    public ResponseVo<List<Tag>> getTagList() {
        List<Tag> result = tagService.getTagList();
        return new ResponseVo<>(result);
    }
}
