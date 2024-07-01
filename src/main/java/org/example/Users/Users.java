package org.example.Users;

import org.example.Books.Book;
import org.example.Books.BookFactory;

import java.util.ArrayList;
import java.util.Random;

public class Users {
    public static ArrayList<People> libraryUsers = new ArrayList<>();

    public static ArrayList<People> getlibraryUsers() {
        return libraryUsers;
    }

    public Users() {
        ArrayList<Students> students = CreatingPersons.generateStudents(10);
        ArrayList<Teachers> teachers = CreatingPersons.generateTeachers(10);

        libraryUsers.addAll(students);
        libraryUsers.addAll(teachers);
    }

    public void distributeUsersBooks(People user, BookFactory library) {
        int booksQuantity = new Random().nextInt(8) + 3;

        whileLoop:
        while (user.getUserListBook().size() < booksQuantity) {
            int index = new Random().nextInt(library.generateBooks().size());
            Book book = library.generateBooks().get(index);
            for (Book bookUser : user.getUserListBook()) {
                if (bookUser.toString() == book.toString()) {
                    continue whileLoop;
                }
            }
            user.addBook(book);
        }
    }
}
