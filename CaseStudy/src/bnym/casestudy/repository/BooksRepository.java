package bnym.casestudy.repository;

import org.springframework.data.repository.CrudRepository;

import bnym.casestudy.entity.Books;

public interface BooksRepository extends CrudRepository<Books,String> {

}
