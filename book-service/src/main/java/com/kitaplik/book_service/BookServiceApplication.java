package com.kitaplik.book_service;

import com.kitaplik.book_service.model.Book;
import com.kitaplik.book_service.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class 	BookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
	}


	private final BookRepository repository;

	public BookServiceApplication(BookRepository repository) {
		this.repository = repository;
	}




	public void run(String... args) throws Exception {
		Book book1 = new Book("Dünyanın Gözü", 2000, "Robert Jordan", "İthaki Yayınevi", "123456");
		Book book2 = new Book("Yüzüklerin Efendisi", 1960, "J.R.R Tolkien", "Metis Yayıncılık", "456789");
		Book book3 = new Book("Harry Potter ve Felsefe Taşı", 1997, "J. K. Rowling", "YKB Yayınları", "987654");

		List<Book> bookList = repository.saveAll(Arrays.asList(book1, book2, book3));

		System.out.println(bookList);
	}

}
