package com.devtiro.Blog.mapper;

import com.devtiro.Blog.domain.PostStatus;
import com.devtiro.Blog.domain.dtos.TagDto;
import com.devtiro.Blog.domain.entities.Post;
import com.devtiro.Blog.domain.entities.Tag;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;

import java.util.Set;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TagMapper {

    @Mapping(target = "postCount", source = "posts", qualifiedByName = "calculatePostCount")
    TagDto toTagResponse(Tag tag);

//    Tag toTag(TagDto tagResponse);

    @Named("calculatePostCount")
    default long calculatePostCount(Set<Post> posts) {
        if (null == posts) {
            return 0;
        }
        return posts.stream().filter(post -> PostStatus.PUBLISHED.equals(post.getStatus())).count();
    }

}
