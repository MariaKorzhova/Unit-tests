package HW4;

import java.util.List;

public interface BookRepository {
    Book findById(String id);
    List<Book> findAll();

    List<Book> findBookByAuthor(String author);
}
