package com.mybooks.services;

import com.mybooks.exceptions.AuthorNotFoundException;
import com.mybooks.models.Author;
import com.mybooks.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService{

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public List<Author> getAllAuthors() {
        return (List<Author>) authorRepository.findAll();
    }

    @Override
    public Author getAuthorById(Long id) {
        Optional<Author> opt = authorRepository.findById(id);
        if(opt.isPresent()) {
            return opt.get();
        }
        else {
            throw new AuthorNotFoundException("Author by id: "+id+" is not present");
        }
    }

    @Override
    public void deleteAuthorById(Long id) {
        authorRepository.deleteById(id);
    }

    @Override
    public void updateAuthor(Author author) {
        authorRepository.save(author);
    }
}
