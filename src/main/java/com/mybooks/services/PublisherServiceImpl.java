package com.mybooks.services;

import com.mybooks.exceptions.PublisherNotFoundException;
import com.mybooks.models.Publisher;
import com.mybooks.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublisherServiceImpl implements PublisherService{

    @Autowired
    private PublisherRepository publisherRepository;

    @Override
    public Publisher savePublisher(Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    @Override
    public List<Publisher> getAllPublishers() {
        return (List<Publisher>) publisherRepository.findAll();
    }

    @Override
    public Publisher getPublisherById(Long id) {
        Optional<Publisher> opt = publisherRepository.findById(id);
        if(opt.isPresent()) {
            return opt.get();
        }
        else {
            throw new PublisherNotFoundException("Publisher with id: "+id+" not found");
        }
    }

    @Override
    public void deletePublisherById(Long id) {
        publisherRepository.deleteById(id);
    }

    @Override
    public void updatePublisher(Publisher publisher) {
        publisherRepository.save(publisher);
    }
}
