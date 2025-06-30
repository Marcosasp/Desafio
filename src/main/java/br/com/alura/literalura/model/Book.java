package br.com.alura.literalura.model;

import br.com.alura.literalura.dto.BookDTO;
import jakarta.persistence.*;

@Entity(name = "Book")
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String title;
    private String language;
    private Integer numberOfDownloadsS;
    @ManyToOne
    private Author author;

    public Book(){}

    public Book(BookDTO data) {
        this.title = data.title();
        this.author = new Author(data.authors().getFirst());
        this.language = data.languages().getFirst();
        this.numberOfDownloadsS = data.numberOfDownloadsS();
    }

    public Book (String title, Author author, String language, Integer numberOfDownloadsS){
        this.title = title;
        this.author = author;
        this.language = language;
        this.numberOfDownloadsS = numberOfDownloadsS;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getNumberOfDownloadsS() {
        return numberOfDownloadsS;
    }

    public void setNumberOfDownloadsS(Integer numberOfDownloadsS) {
        this.numberOfDownloadsS = numberOfDownloadsS;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "\n====================== LIVRO ======================" + '\n' +
                "Título:  " + title + '\n' +
                "Autor: " + author.getName() + '\n' +
                "Idioma: " + language + '\n' +
                "Número de downloads: " + numberOfDownloadsS +'\n' +
                "===================================================" + '\n';
    }
}
