package com.shollyb.goodreads.respositories;

import com.shollyb.goodreads.models.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BookRepository extends MongoRepository<Book, String > {

    Book findBookByTitleIsIgnoreCase(String title);
    @Override
    Page<Book> findAll(Pageable pageable);
}
