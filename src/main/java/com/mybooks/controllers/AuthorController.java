package com.mybooks.controllers;

import com.mybooks.models.Author;
import com.mybooks.repositories.AuthorRepository;
import com.mybooks.services.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;
    private final AuthorServiceImpl authorService;

    @Autowired
    public AuthorController(AuthorRepository authorRepository, AuthorServiceImpl authorService) {
        this.authorRepository = authorRepository;
        this.authorService = authorService;
    }


    @RequestMapping("/authors")
    public String getAuthors(Model model) {
        List<Author> authorList = authorService.getAllAuthors();
        model.addAttribute("authors", authorList);
        return "authors/list";
    }
}
