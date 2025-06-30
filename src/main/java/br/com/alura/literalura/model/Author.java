package br.com.alura.literalura.model;

import br.com.alura.literalura.dto.AuthorDTO;
import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Entity(name = "Author")
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
    private Integer birthYear;
    private Integer deathYear;
    @OneToMany(mappedBy = "author", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Book> books = new LinkedHashSet<>();

    public Author(){}

    public Author(AuthorDTO data) {
        this.name = data.name();
        this.birthYear = data.birthYear();
        this.deathYear = data.deathYear();
    }

    public Author(String name, Integer birthYear, Integer deathYear){
        this.name = name;
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(Integer deathYear) {
        this.deathYear = deathYear;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "\n====================== AUTOR ======================" + '\n' +
                "Autor:  " + name + '\n' +
                "Ano de nascimento: " + (birthYear != null ? birthYear.toString() : "Desconhecido") + '\n' +
                "Ano de falecimento: " + (deathYear != null ? deathYear.toString() : "Desconhecido") + '\n' +
                "Livros: " + books.stream().map(b -> b.getTitle()).collect(Collectors.toSet()) + '\n' +
                "===================================================";
    }
}
