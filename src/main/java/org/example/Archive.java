package org.example;

import org.example.Books.BookFactory;
import org.example.Users.People;
import org.example.Users.Users;

import java.util.ArrayList;
import org.example.Books.*;

public class Archive {
    private Users users;
    private BookFactory library;
    private ArrayList<People> libraryUsers;

    public ArrayList<People> getLibraryUsers() {
        return libraryUsers;
    }

    public Archive() {
        users = new Users();
        library = new BookFactory();
        libraryUsers = users.getlibraryUsers();
        for (People user : libraryUsers) {
            users.distributeUsersBooks(user, library);
        }
    }
}