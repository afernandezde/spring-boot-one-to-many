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

    @Column(name = "published")
    private boolean published;

    @Column(name = "author")
    private String author; // Nuevo campo para el autor

    public Tutorial() {

    }

    public Tutorial(String title, String description, boolean published, String author) {
        this.title = title;
        this.description = description;
        this.published = published;
        this.author = author; // Nuevo constructor con el autor
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

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean isPublished) {
        this.published = isPublished;
    }

    public String getAuthor() { // Nuevo getter para el autor
        return author;
    }

    public void setAuthor(String author) { // Nuevo setter para el autor
        this.author = author;
    }

    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", title=" + title + ", description=" + description + ", published=" + published + ", author=" + author + "]";
    }
}