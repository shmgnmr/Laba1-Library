package org.example.Users;

public class Students extends People {
    public Students(String surname, String name) {
        super(surname, name);
    }

    @Override
    public String getFullName() {
        return surname + " " + name;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
