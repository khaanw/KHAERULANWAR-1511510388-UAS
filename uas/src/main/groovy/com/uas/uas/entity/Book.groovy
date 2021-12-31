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

@Entity
@Table(name = "books")
class Book
{

@Id    
@GeneratedValue(strategy = GenerationType.IDENTITY)    
// @Column(name="id")
Integer id 

@NotNull    
 @Column(nullable=false)
// @Column(name="name")
String name 

@NotNull    
// @Column(name="isbn")
  @Column(nullable=false)
String isbn



  @ManyToOne( // tell persistence provider 'categories' is a many-to-one relation with Book
      fetch = FetchType.EAGER, // do not fetch value when Book is loaded
      optional = false // will make the foreign key mandatory
  )
   
    Category category

 }