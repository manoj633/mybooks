package com.mybooks.services;

import com.mybooks.models.Publisher;

import java.util.List;

public interface PublisherService {

    public Publisher savePublisher(Publisher publisher);
    public List<Publisher> getAllPublishers();
    public Publisher getPublisherById(Long id);
    public void deletePublisherById(Long id);
    public void updatePublisher(Publisher publisher);
}
