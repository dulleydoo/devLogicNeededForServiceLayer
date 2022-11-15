package com.gotbizlogic.demo.of.incompleteCodeBase.services;

import com.gotbizlogic.demo.of.incompleteCodeBase.models.Author;
import com.gotbizlogic.demo.of.incompleteCodeBase.repos.AuthorRepo;
import com.gotbizlogic.demo.of.incompleteCodeBase.repos.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepo authorRepo;
    @Autowired
    private BookRepo bookRepo;

    public Iterable<Author> getAllAuthors(String name){
        return authorRepo.findByNameContaining(name);
    }

    public Author createAuthor(Author author){
        return authorRepo.save(author);
    }
    public Iterable<Author> searchForAuthorByName(String search){
        return authorRepo.searchForAuthorByName(search);
    }





















}

    /*
        //THIS IS THE ONLY FILE YOU SHOULD WRITE CODE
        //THIS IS WHERE YOUR LOGIC COMES INTO PLAY
        //DO NOT TOUCH THE CONTROLLER OR MODELS OR REPOS!!!
     */

    //Todo - Business Logic or Algorithm needed to create an author
    //Todo - Business Logic or Algorithm needed to GetAll authors and to also be able to Search for an author by name


