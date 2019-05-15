package bnym.casestudy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import bnym.casestudy.entity.Books;
import bnym.casestudy.repository.BooksRepository;
import bnym.casestudy.service.BooksDetailsDao;

@Controller
public class BooksController {
	
	@Autowired
	BooksRepository booksrepository;
	
	@Autowired
	BooksDetailsDao booksService;
	
	@RequestMapping("/browsebooks")
	public ModelAndView listbooks() {
		ModelAndView mav = new ModelAndView("browsebooks");
		List<Books> bookslist = new ArrayList<Books>();
		bookslist = booksService.getAllBooks();
		mav.addObject("bookslist",bookslist);
		return mav;
	}

}
