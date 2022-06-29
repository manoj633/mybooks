package com.mybooks.services;

import com.mybooks.models.Book;

import java.util.List;

public interface BookService {

    public Book saveBook(Book book);
    public List<Book> getAllBooks();
    public Book getBookById(Long id);
    public void deleteBookById(Long id);
    public void updateBook(Book book);
}
