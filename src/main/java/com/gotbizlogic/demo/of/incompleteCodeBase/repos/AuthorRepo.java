package com.gotbizlogic.demo.of.incompleteCodeBase.repos;

import com.gotbizlogic.demo.of.incompleteCodeBase.models.Author;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends CrudRepository<Author, Long> {

    @Query(value = "select * from author WHERE name LIKE CONCAT ('%', :query, '%')" , nativeQuery = true)
    Iterable<Author> searchForAuthorByName(String query);

    Iterable<Author> findByNameContaining(String name);
}
