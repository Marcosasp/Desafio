package br.com.alura.literalura.repository;

import br.com.alura.literalura.model.Author;
import br.com.alura.literalura.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByTitleContainingIgnoreCase(String bookTitle);

    List<Book> findByLanguageContainingIgnoreCase(String languageCode);


    Set<Book> findByAuthor(Author a);
}
