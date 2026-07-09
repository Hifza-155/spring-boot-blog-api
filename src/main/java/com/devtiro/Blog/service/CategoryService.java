package com.devtiro.Blog.service;

import com.devtiro.Blog.domain.dtos.CreateCategoryDto;
import com.devtiro.Blog.domain.entities.Category;

import java.util.List;
import java.util.UUID;

public interface CategoryService {
    List<Category> listCategories();
    Category createCategory(Category category);
    void deleteCategory(UUID id);
    Category getCategoryById(UUID id);

}
