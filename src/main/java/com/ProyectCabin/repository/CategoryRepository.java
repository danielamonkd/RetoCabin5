
package com.ProyectCabin.repository;



import com.ProyectCabin.model.CategoryModel;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepository {
    @Autowired
    
    private CategoryCrudRepository categoryCrudRepository;
    
     public List<CategoryModel> getAllCategoryModel(){
        return (List<CategoryModel>)categoryCrudRepository.findAll();
    }

    public Optional<CategoryModel> getCategoryById(Integer idCategory){
        return  categoryCrudRepository.findById(idCategory);
   }
   
    public CategoryModel save(CategoryModel categoryModel){
        return categoryCrudRepository.save(categoryModel);
    }
    
    public CategoryModel update(CategoryModel categoryModel){
        return categoryCrudRepository.save(categoryModel);
    }
    
    public boolean delete(Integer idCategory){
        categoryCrudRepository.deleteById(idCategory);
        return true;
    }
}
