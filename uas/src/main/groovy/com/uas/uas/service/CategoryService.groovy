package com.uas.uas.service
import com.uas.uas.entity.Category

interface CategoryService{
    List<Category> findAll()

    // Category findById(int id)
    // Category save(Category category)
    // Category update(Category category, int id)
    // Category delete(int id)
}