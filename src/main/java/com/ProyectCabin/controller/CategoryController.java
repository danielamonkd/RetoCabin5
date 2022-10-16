
package com.ProyectCabin.controller;


import com.ProyectCabin.model.CategoryModel;
import com.ProyectCabin.service.CategoryService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/Category")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})

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
