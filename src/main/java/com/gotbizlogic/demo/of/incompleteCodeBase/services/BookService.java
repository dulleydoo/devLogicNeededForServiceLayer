package com.gotbizlogic.demo.of.incompleteCodeBase.services;

import com.gotbizlogic.demo.of.incompleteCodeBase.models.Book;
import com.gotbizlogic.demo.of.incompleteCodeBase.repos.AuthorRepo;
import com.gotbizlogic.demo.of.incompleteCodeBase.repos.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;
    @Autowired
    private AuthorRepo authorRepo;

    public Book createBook(Long authorId, Book book){
        authorRepo.findById(authorId).map(author -> {
            book.setAuthor(author);
            return bookRepo.save(book);});
        return book;
    }

    public Optional<Book> getBookById(Long bookId){
        
        return Optional.ofNullable(bookRepo.findById(bookId).orElse(null));
    }

    public Iterable<Book> getAllBooksByAuthorId(Long authorId){
        return bookRepo.findByAuthorId(authorId);

    }













}

        /*
            //THIS IS THE ONLY FILE YOU SHOULD WRITE CODE
            //THIS IS WHERE YOUR LOGIC COMES INTO PLAY
            //DO NOT TOUCH THE CONTROLLER OR MODELS OR REPOS!!!
        */

    //Todo - Business Logic or Algorithm needed to create a book

    //Todo - Business Logic or Algorithm needed to getAllBooksByAuthorId

    //Todo - Business Logic or Algorithm needed to getBookById


