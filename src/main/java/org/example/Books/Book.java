package org.example.Books;

public abstract class Book {
    protected String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getFullDiscription(){
        return this.title;
    };
    public String toString() {
        return this.title;
    }

}
