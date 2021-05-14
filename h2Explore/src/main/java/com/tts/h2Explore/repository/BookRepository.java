package com.tts.h2Explore.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.tts.h2Explore.model.Book;



//Long aligns with your ID type for your entity
//the repository needs to have its ID type defined, otherwise it will not work

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

 // this method will be generated for us by spring
 // the generation will follow the name of the method
 // in order to perform the requested functionality
 List<Book> findByTitle(String title);

 // basically anything you can do in SQL you can do here
 List<Book> findByAuthor(String author);

 // findById is default and given to you for free
}