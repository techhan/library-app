package com.group.libraryapp.repository.book;

import org.springframework.stereotype.Repository;

//@Primary
@Repository
public class BookMysqlRepository implements BookRepository{

    @Override
    public void saveBook() {
        System.out.println("BookMysqlRepository.saveBook");
    }
}
