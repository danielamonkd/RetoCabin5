
package com.ProyectCabin.controller;


import com.ProyectCabin.model.CategoryModel;
import com.ProyectCabin.service.CategoryService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/Category")
@CrossOrigin(origins = "*")

public class CategoryController {
    @Autowired private CategoryService categoryService;

    @GetMapping("/all")
    public List<CategoryModel> getAllCategoryModels(){
        return categoryService.getAllCategoryModels();
    }

    @GetMapping("/{id}")
    public Optional<CategoryModel> getCategoryById(@PathVariable("id") Integer id) {
        return categoryService.getCategorById(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public CategoryModel save (@RequestBody CategoryModel categoryModel){
        categoryService.saveCategoryModel(categoryModel);
        return categoryService.saveCategoryModel(categoryModel);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public CategoryModel update(@RequestBody CategoryModel categoryModel) {
        return categoryService.update(categoryModel);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") Integer id) {
        return categoryService.deleteCategoryModel(id);
    }
}
