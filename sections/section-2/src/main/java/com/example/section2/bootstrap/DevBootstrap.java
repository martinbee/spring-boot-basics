package com.example.section2.bootstrap;

import com.example.section2.model.Author;
import com.example.section2.model.Book;
import com.example.section2.model.Publisher;
import com.example.section2.repositories.AuthorRepository;
import com.example.section2.repositories.BookRepository;
import com.example.section2.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
  private AuthorRepository authorRepository;
  private BookRepository bookRepository;
  private PublisherRepository publisherRepository;

  public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
    this.authorRepository = authorRepository;
    this.bookRepository = bookRepository;
    this.publisherRepository = publisherRepository;
  }

  @Override
  public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
    initData();
  }

  private void initData() {
    // Sanderson
    Author sanderson = new Author("Brandon", "Sanderson");
    Publisher tor = new Publisher("Tor", "123 Tor street");
    Book mistborn = new Book("Mistborn", "0-7653-1178-X", tor);
    sanderson.getBooks().add(mistborn);
    mistborn.getAuthors().add(sanderson);

    authorRepository.save(sanderson);
    publisherRepository.save(tor);
    bookRepository.save(mistborn);

    // Thich
    Author thich = new Author("Thich", "Hanh");
    Publisher beacon = new Publisher("Beacon", "123 Tibet street");
    Book miracle = new Book("The Miracle of Mindfulness", "0-8070-1239-4", beacon);
    thich.getBooks().add(miracle);
    miracle.getAuthors().add(thich);

    authorRepository.save(thich);
    publisherRepository.save(beacon);
    bookRepository.save(miracle);
  }
}
