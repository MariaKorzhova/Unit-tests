package HW4;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class testBookService {
    BookRepository mockRepository;
    BookService serviceBook;

    @BeforeEach
    public void setUp() {

        // Создали мок-объект BookRepository
        mockRepository = mock(BookRepository.class);

        // Создали экземпляр BookService, передали мок-объект
        serviceBook = new BookService(mockRepository);
    }

    @Test
    public void testFindById() {

        // Если вызываем findById, возвращается объект книги
        when(mockRepository.findById(anyString())).thenReturn(new Book("1"));

        assertTrue(serviceBook.findBookById("2") instanceof Book);

        // Проверка того, что метод mockRepository.findById был вызван один раз
        verify(mockRepository, times(1)).findById(anyString());
    }

    @Test
    public void testFindBookByAuthor() {
        // Если вызываем findBookByAuthor, возвращается объект книги
        List<Book> expectedBooks = new ArrayList<>();
        when(mockRepository.findBookByAuthor("Author1")).thenReturn(expectedBooks);

        List<Book> result = serviceBook.findBookByAuthor("Author1");

        // Проверка того, что метод findBookByAuthor() был вызван с верными аргументами
        verify(mockRepository).findBookByAuthor("Author1");

        // Проверка наличия книги
        assertEquals(expectedBooks, result);
    }
}
