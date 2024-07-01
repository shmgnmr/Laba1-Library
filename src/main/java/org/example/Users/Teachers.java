package org.example.Users;

public class Teachers extends People {
    public String patronymic;

    public Teachers(String surname, String name, String patronymic) {
        super(surname, name);
        this.patronymic = patronymic;
    }

    @Override
    public String getFullName() {
        return surname + " " + name + " " + patronymic;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + patronymic;
    }
}
