package com.devtiro.Blog.service;

import com.devtiro.Blog.domain.entities.Tag;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface TagService {
    public List<Tag> listTags();
    List<Tag> createTags(Set<String> tagNames);
    void deleteTag(UUID id);
    Tag getTagById(UUID id);
    List<Tag> getTagByIds(Set<UUID> ids);

}
