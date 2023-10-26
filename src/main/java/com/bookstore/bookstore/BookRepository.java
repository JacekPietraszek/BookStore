package com.bookstore.bookstore;

import org.springframework.data.repository.CrudRepository;

interface BookRepository extends CrudRepository<Book, Long> {

}
