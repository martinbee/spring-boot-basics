package com.example.section2.bootstrap;

import com.example.section2.model.Author;
import com.example.section2.model.Book;
import com.example.section2.repositories.AuthorRepository;
import com.example.section2.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
  private AuthorRepository authorRepository;
  private BookRepository bookRepository;

  public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
    this.authorRepository = authorRepository;
    this.bookRepository = bookRepository;
  }

  @Override
  public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
    initData();
  }

  private void initData() {
    // Sanderson
    Author sanderson = new Author("Brandon", "Sanderson");
    Book mistborn = new Book("Mistborn", "0-7653-1178-X", "Tor");
    sanderson.getBooks().add(mistborn);
    mistborn.getAuthors().add(sanderson);

    authorRepository.save(sanderson);
    bookRepository.save(mistborn);

    // Thich
    Author thich = new Author("Thich", "Hanh");
    Book miracle = new Book("The Miracle of Mindfulness", "0-8070-1239-4", "Beacon Books");
    thich.getBooks().add(miracle);
    miracle.getAuthors().add(thich);

    authorRepository.save(thich);
    bookRepository.save(miracle);
  }
}
