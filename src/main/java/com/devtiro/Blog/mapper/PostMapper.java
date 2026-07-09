package com.devtiro.Blog.mapper;

import com.devtiro.Blog.domain.CreatePostRequest;
import com.devtiro.Blog.domain.UpdatePostRequest;
import com.devtiro.Blog.domain.dtos.CreatePostRequestDto;
import com.devtiro.Blog.domain.dtos.PostDto;
import com.devtiro.Blog.domain.dtos.UpdatePostRequestDto;
import com.devtiro.Blog.domain.entities.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PostMapper {

    @Mapping(target = "author", source = "author")
    @Mapping(target = "category", source = "category")
    @Mapping(target = "tags", source = "tags")
    PostDto toDto(Post post);

    @Mapping(target = "status", source = "status")
    CreatePostRequest toCreatePostRequest(CreatePostRequestDto dto);

    UpdatePostRequest toUpdatePostRequest(UpdatePostRequestDto dto);


}
