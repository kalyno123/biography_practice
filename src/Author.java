import java.util.ArrayList;

public class Author {

    /**
     * WORK ON BOOK CLASS FIRST
     Create a custom constructor that will take 6 args and defines the Author object
     Define Author class fields as firstName, lastName, country, isAlive, age, list of books
     */

    //Create 6 args custom constructor here
    public Author(String firstName, String lastName, String country, boolean isAlive, int age, ArrayList<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.isAlive = isAlive;
        this.age = age;
        Author.books = books;
    }

    /*
    Define instance variables here
    NOTE: Books must be defined as a List of Objects of Book class not String
    */
    public static final String askFirstName = "What is your favorite author’s first name?";
    public static final String askLastName = "What is your favorite author’s last name?";
    public static final String askCountry = "Where is your favorite author from?";
    public static final String askIsAlive = "Is your favorite author alive? Y/N";
    public static final String askAge = "How old is your favorite author?";

    public String firstName;
    public String lastName;
    public String country;
    public boolean isAlive;
    public int age;
    public static ArrayList<Book> books;


    //Override toString() method here that returns Author object information
    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", isAlive=" + isAlive +
                ", age=" + age +
                "\nAuthor's books are as listed below:" +
                ", books=" + books +
                '}';
    }
}
