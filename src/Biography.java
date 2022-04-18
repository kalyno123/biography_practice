import java.util.ArrayList;
import java.util.Scanner;

public class Biography {
    public static void main(String[] args) {

        /**
         * WORK ON BOOK AND AUTHOR CLASSES FIRST
         This will be our actual program that we define author and his books
         In this program we will write the biography of Stefan Zweig, an Austrian novelist.

         Write a program that will get information from user and
         -Print information for the favorite author
         -Print information of the books of favorite author

         Full name = Stefan Zweig
         County = Austria
         Is still alive: No (28 November 1881 – 22 February 1942)
         Some of his books as listed below:

         BookName                            Genre           TotalPage
         Amok                                tale            189
         The Royal Game                      novella         53
         24 Hours in the Life of a Woman     novella         80

         QUESTIONS TO ASK IN PROGRAM:
         Firstly, program will ask user to enter their favorite author’s information as below:
         What is your favorite author’s first name?
         What is your favorite author’s last name?
         Where is your favorite author from?
         Is your favorite author alive? Y/N
         If user enters Y, then ask How old is your favorite author? If, user enters N, then skip this question.
         Then, program will ask about user’s favorite author’s books.
         First, ask if they want to enter book information with below question:
         Would you like enter book information? (Y/N)
         If answer is Y, then ask below questions about the book:
         What is the book name?
         What is genre of the book?
         How many pages does book have?
         NOTE: Keep asking user “Would you like enter book information? (Y/N)” question until they enter N and store all book information you got in Book objects.
         */

        /* Expected result:
        Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}
        Author's books are as listed below:
        Book{name='Amok', genre='tale', page=189}
        Book{name='The Royal Game', tale='novella', page=53}
        Book{name='24 Hours in the Life of a Woman', tale='novella', page=80}
        */

        Scanner userInput = new Scanner(System.in);

        System.out.println(Author.askFirstName);
        String firstName = userInput.next();

        System.out.println(Author.askLastName);
        String lastName = userInput.next();

        System.out.println(Author.askCountry);
        String country = userInput.next();

        System.out.println(Author.askIsAlive);
        boolean isAlive = userInput.next().toUpperCase().startsWith("Y");

        int age = 0;
        if (isAlive) { // if alive ask for age; if not skip age question.
            System.out.println(Author.askAge);
            age = userInput.nextInt();
        }


        ArrayList<Book> books = new ArrayList<>();
        String answer;
        do {
            System.out.println(Book.askBookInfo); // if yes then ask; if no then end.
            answer = userInput.next();

            if (answer.toUpperCase().startsWith("N")) break;
            else if (answer.toUpperCase().startsWith("Y")){
                System.out.println(Book.askBookName);
                userInput.nextLine();
                String name = userInput.nextLine();

                System.out.println(Book.askBookGenre);
                String genre = userInput.next();

                System.out.println(Book.askBookPages);
                int totalPage = userInput.nextInt();

                Book book = new Book(name, genre, totalPage);
                books.add(book);
            }
        } while (answer.toUpperCase().startsWith("Y"));


        Author author = new Author(firstName, lastName, country, isAlive, age, books);
        System.out.println(author);




    }
}
