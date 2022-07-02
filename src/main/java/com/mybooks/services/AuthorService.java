package com.mybooks.services;

import com.mybooks.models.Author;

import java.util.List;

public interface AuthorService {

    public Author saveAuthor(Author author);
    public List<Author> getAllAuthors();
    public Author getAuthorById(Long id);
    public void deleteAuthorById(Long id);
    public void updateAuthor(Author author);
}
