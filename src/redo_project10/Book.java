package redo_project10;

public class Book {

    // COSTUME CONSTRUCTOR:
    public Book(String name, String genre, int totalPage) {
        this.name = name;
        this.genre = genre;
        this.totalPage = totalPage;
    }

    // INSTANCE VARIABLES:
    public String name;
    public String genre;
    public int totalPage;

    // OVERRIDE TOSTRING();
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", totalPage=" + totalPage +
                '}';
    }






}
