package com.pluralsight.northwindtraders.data;

import com.pluralsight.northwindtraders.model.Category;

import java.util.List;

public interface CategoryDao {

    Category getById(int id);

    List<Category> getAll();

}
