package redo_project10;

import java.util.ArrayList;

public class Author {

    // COSTUME CONSTRUCTOR:
    public Author(String firstName, String lastName, String country, boolean isAlive, int age, ArrayList<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.isAlive = isAlive;
        this.age = age;
        this.books = books;
    }

    // INSTANCE VARIABLE:
    public String firstName;
    public String lastName;
    public String country;
    public boolean isAlive;
    public int age;
    public ArrayList<Book> books;

    // OVERRIDE TOSTRING();
    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", isAlive=" + isAlive +
                (isAlive ? ", age=" + age : "") +
                '}';
    }






}
