package pl.coderslab.app;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> getBooks();
    void add(Book book);
    Optional<Book> get(Long id);
    void delete(Long id);
    void update(Book book);
}
