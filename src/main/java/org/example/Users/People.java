package org.example.Users;

import org.example.Books.Book;

import java.util.ArrayList;

public abstract class People {
    public String surname;
    public String name;
    public ArrayList<Book> userListBook;

    public People(String surname, String name) {
        this.surname = surname;
        this.name = name;
        userListBook = new ArrayList<Book>();
    }

    public ArrayList<Book> getUserListBook() {
        return userListBook;
    }

    public void addBook(Book book) { // Изменение параметра метода
        userListBook.add(book);
    }

    public String getFullName() {
        return surname + " " + name;
    }


}
