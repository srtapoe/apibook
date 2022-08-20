package br.com.book.apibook.service;

import br.com.book.apibook.entity.Book;
import br.com.book.apibook.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookImplService implements BookService{

    private final BookRepository bookRepository;

    public BookImplService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public List<Book> listarTodos() {
        return bookRepository.findAll();
    }

    @Override
    public Book savarBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void delete(Long id) {
        try {
            bookRepository.deleteById(id);
        }catch (Exception e) {
            throw new RuntimeException("Um erro ocorreu ao excluir um livro.");
        }
    }
}
