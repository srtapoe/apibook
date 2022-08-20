package br.com.book.apibook.service;

import br.com.book.apibook.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> listarTodos();

    Book savarBook(Book book);

    void delete(Long id);

}
