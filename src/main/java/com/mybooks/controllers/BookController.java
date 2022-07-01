package com.mybooks.controllers;

import com.mybooks.models.Book;
import com.mybooks.repositories.BookRepository;
import com.mybooks.services.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class BookController {

    private final BookServiceImpl bookService;

    public BookController(BookServiceImpl bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "books/list";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String listBooks(Model model, @RequestParam("page") Optional<Integer> page, @RequestParam("size") Optional<Integer> size){
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(5);

        Page<Book> bookPage = bookService.findPaginated(PageRequest.of(currentPage-1, pageSize));
        model.addAttribute("bookPage",bookPage);
        model.addAttribute("books", bookService.getAllBooks());
        System.out.println(bookService.getBookById(87L).getPublisher().getName());
        List<HashMap<String, String>> msg = new ArrayList<>();
        msg.add((HashMap<String, String>) new HashMap<>().put("id", "Book id"));
        msg.add((HashMap<String, String>) new HashMap<>().put("name", "Book Name"));
        model.addAttribute("msg", msg);


        int totalPages = bookPage.getTotalPages();
        if(totalPages>0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "books/home";
    }

}
