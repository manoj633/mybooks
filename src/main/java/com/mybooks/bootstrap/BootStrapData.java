package com.mybooks.bootstrap;

import com.mybooks.models.Author;
import com.mybooks.models.Book;
import com.mybooks.models.Publisher;
import com.mybooks.repositories.AuthorRepository;
import com.mybooks.repositories.BookRepository;
import com.mybooks.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher rson = new Publisher("R Sons Books", "Ho. No. 1658, Gali No. 18, Nathu Colony", "Nathupura", "New Delhi", "110084");
        publisherRepository.save(rson);

        Author paulo = new Author("Paulo Coelho");
        Book alchemist = new Book("The Alchemist", "12345", "https://fourminutebooks.com/wp-content/uploads/2020/11/self-help-books-1.jpg", rson);
        Set<Author> authors = new HashSet<>();
        authors.add(paulo);
        alchemist.setAuthors(authors);
        authorRepository.save(paulo);
        bookRepository.save(alchemist);


        ///////////////////////////

//        Author eric = new Author("Eric", "Andre");
//        Book ddd = new Book("Domain driven design", "123456");
//        eric.getBooks().add(ddd);
//        ddd.getAuthors().add(eric);
//        HashSet<Author> authors = new HashSet<>();
//        authors.add(eric);
//        ddd.setAuthors(authors);
//        ddd.setPublisher(rson);
//        rson.getBooks().add(ddd);
//        authorRepository.save(eric);
//        bookRepository.save(ddd);
//
//        Author mark = new Author("Mark", "Manson");
//        Book subtleArt = new Book("The subtle art of not givng a fuck", "123457");
//        mark.getBooks().add(subtleArt);
//        subtleArt.getAuthors().add(mark);
//        subtleArt.setPublisher(rson);
//        rson.getBooks().add(subtleArt);
//        authorRepository.save(mark);
//        bookRepository.save(subtleArt);
//
//        Author kafka = new Author("Franz", "Kafka");
//        Book metamorphosis = new Book("Metamorphosis", "123458");
//        kafka.getBooks().add(metamorphosis);
//        metamorphosis.getAuthors().add(kafka);
//        metamorphosis.setPublisher(rson);
//        rson.getBooks().add(metamorphosis);
//        authorRepository.save(kafka);
//        bookRepository.save(metamorphosis);
//
//        Author george = new Author("George S", "Clason");
//        Book richestman = new Book("The richest man in babylon", "123459");
//        george.getBooks().add(richestman);
//        richestman.getAuthors().add(george);
//        richestman.setPublisher(rson);
//        rson.getBooks().add(richestman);
//        authorRepository.save(george);
//        bookRepository.save(richestman);

        System.out.println("Started in Bootstrap");
        System.out.println("No of Books : "+bookRepository.count());
        System.out.println("No of Authors : "+authorRepository.count());
        System.out.println("No of publication : "+publisherRepository.count());
        System.out.println("No of Books published by "+rson.getName()+" publication : "+rson.getBooks().size());

    }
}
