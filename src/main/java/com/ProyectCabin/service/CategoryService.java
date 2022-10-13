
package com.ProyectCabin.service;


import com.ProyectCabin.model.CategoryModel;
import com.ProyectCabin.repository.CategoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    
    public List<CategoryModel> getAllCategoryModels(){
        return categoryRepository.getAllCategoryModel();
    }
    
    public Optional<CategoryModel> getCategorById(Integer idCategory) {
        return categoryRepository.getCategoryById(idCategory);
    }
    
    public CategoryModel saveCategoryModel(CategoryModel categoryModel){
        return categoryRepository.save(categoryModel);
    }
    
    public boolean deleteCategoryModel(Integer idCategory) {
       return categoryRepository.delete(idCategory);
}
    public CategoryModel update(CategoryModel categoryModel){
        return categoryRepository.update(categoryModel);
    }
}
