package com.uas.uas.service.impl
import com.uas.uas.entity.Category
import com.uas.uas.repository.CategoryRepository
import com.uas.uas.service.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
// import javax.persistence.EntityNotFoundException

@Service
class CategoryServiceImpl implements CategoryService{

    @Autowired
    private final CategoryRepository CategoryRepository

    @Override
    List<Category> findAll(){
    CategoryRepository.findAll()
}
    // @Override
    // Category findById(int id) {
    // CategoryRepository.findById(id)
    // }

    // @Override
    // Category delete(int id) {
    // def record =  CategoryRepository.findById(id)
    // CategoryRepository.delete(record)   
    
    // record
    // }

    // @Override
    // Category save(Category category) {
    // CategoryRepository.save(category)
    // }


    // @Override
    // Category update(Category category, int id) {
    // def record =  CategoryRepository.findById(id)
    // record.with{
    // name = category.name
    // }
    
    // CategoryRepository.save(record)
    // record
    // }

}