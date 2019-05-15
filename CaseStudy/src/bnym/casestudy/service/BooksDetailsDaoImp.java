package bnym.casestudy.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bnym.casestudy.entity.Books;
import bnym.casestudy.repository.BooksRepository;
@Service
@Transactional
public class BooksDetailsDaoImp implements BooksDetailsDao{

	@Autowired
	private BooksRepository booksrepository;
	
	@Override
	public List<Books> getAllBooks() {
		// TODO Auto-generated method stub
		List<Books> list = new ArrayList<Books>();
		
		for(Books books: booksrepository.findAll()) {
			list.add(books);
		}
		return list;
		
	}

}
