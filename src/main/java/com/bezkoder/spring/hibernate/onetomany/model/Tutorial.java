package com.bezkoder.spring.hibernate.onetomany.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tutorial_generator")
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "author")
    private String author; // Agregado el campo autor

    @Column(name = "published")
    private boolean published;

    public Tutorial() {

    }

    public Tutorial(String title, String description, String author, boolean published) {
        this.title = title;
        this.description = description;
        this.author = author; // Se pasa el parámetro author al constructor
        this.published = published;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() { // Agregado el método getter para autor
        return author;
    }

    public void setAuthor(String author) { // Agregado el método setter para autor
        this.author = author;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean isPublished) {
        this.published = isPublished;
    }

    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", title=" + title + ", description=" + description + ", author=" + author + ", published=" + published + "]";
    }
}