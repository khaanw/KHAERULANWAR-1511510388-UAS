package com.uas.uas.entity
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.Table
import javax.persistence.GenerationType
import javax.validation.constraints.NotNull
import javax.persistence.Column
import javax.validation.constraints.*
import javax.persistence.*
// import com.fasterxml.jackson.annotation.JsonIgnore

@Entity
@Table(name="categories")
class Category{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    // @Column(name="id")
    Integer id

    @NotNull    
    @Column(nullable=false)
    // @Column(name="name")
    String name 


    @OneToMany( // tell persistence provider 'books' is one-to-many relation with Book
      fetch = FetchType.LAZY,
      cascade = CascadeType.ALL      
    )
  
  List<Book> books
}