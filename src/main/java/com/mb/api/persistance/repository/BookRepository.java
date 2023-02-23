package com.mb.api.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mb.api.persistance.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>
{

}
