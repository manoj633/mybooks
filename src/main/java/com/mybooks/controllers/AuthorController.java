package com.mybooks.controllers;

import com.mybooks.repositories.AuthorRepository;
import com.mybooks.services.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    @Autowired
    private final AuthorRepository authorRepository;

    @Autowired
    private final AuthorServiceImpl authorService;

    public AuthorController(AuthorRepository authorRepository, AuthorServiceImpl authorService) {
        this.authorRepository = authorRepository;
        this.authorService = authorService;
    }


    @RequestMapping("/authors")
    public String getAuthors(Model model) {
        System.out.println(authorService.getAuthorById(1L));
        model.addAttribute("authors", authorService.getAllAuthors());
        return "authors/list";
    }
}
