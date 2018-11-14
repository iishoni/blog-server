package com.iishoni.blogserver.service;

import com.iishoni.blogserver.mapper.TagMapper;
import com.iishoni.blogserver.model.Tag;

import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.Resource;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TagService {

    @Resource
    private TagMapper tagMapper;

    /**
     * 获取所有标签
     */
    public List<Tag> getTagList() {
        return tagMapper.all();
    }
}
