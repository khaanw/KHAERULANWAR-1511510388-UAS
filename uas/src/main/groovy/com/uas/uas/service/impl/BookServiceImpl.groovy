package com.uas.uas.service.impl
import com.uas.uas.entity.Book
import com.uas.uas.repository.BookRepository 
import com.uas.uas.service.BookService 
import org.springframework.beans.factory.annotation.Autowired 
import org.springframework.stereotype.Service
import javax.persistence.EntityNotFoundException

@Service 
class BookServiceImpl implements BookService {
 @Autowired    
 private final BookRepository BookRepository 

 @Override    
 List<Book>findAll() { 
 BookRepository.findAll()           
 }

 @Override    
  Book findById(int id) { 
  BookRepository.findById(id)
   }


    @Override
    Book delete(int id) {
    def record =  BookRepository.findById(id)
    BookRepository.delete(record)   
    
    record
  }

    @Override
    Book save(Book book) {
    BookRepository.save(book)
   
  }


    @Override
    Book update(Book book, int id) {
      def record =  BookRepository.findById(id)
      record.with{
        name = book.name
        
      }
    BookRepository.save(record)
    record
    }
 }