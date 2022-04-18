package redo_project10;

import java.util.ArrayList;
import java.util.Scanner;

public class Biography {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your favorite author’s first name?");
        String firstName = scan.next();

        System.out.println("What is your favorite author’s last name?");
        String lastName = scan.next();

        System.out.println("Where is your favorite author is from? ");
        String country = scan.next();

        System.out.println("Is your favorite author is alive? (Y/N)");
        boolean isAlive = scan.next().toUpperCase().startsWith("Y");

        int age = 0;
        if (isAlive) {
            System.out.println("How old is your favorite author");
            age = scan.nextInt();
        }

        ArrayList<Book> books = new ArrayList<>();
        String bookInfo;
        do {
            System.out.println("Would you like enter book information? (Y/N)");
            bookInfo = scan.next();

            if (bookInfo.toUpperCase().startsWith("N")) break;

            else if (bookInfo.toUpperCase().startsWith("Y")){

                System.out.println("What is the book name?");
                scan.nextLine();
                String name = scan.nextLine();

                System.out.println("What is genre of the book?");
                String genre = scan.next();

                System.out.println("How many pages does book have? ");
                int totalPage = scan.nextInt();

                //Book book = new Book(name, genre, totalPage);
                books.add(new Book(name, genre, totalPage));// OR CAN BE ---> books.add(book);
            }

        } while (bookInfo.toUpperCase().startsWith("Y"));

        Author author= new Author(firstName, lastName, country, isAlive, age, books);
        System.out.println("Author's information = " + author);
        System.out.println("Author's books are as listed below:");
        for (Book book: author.books){
            System.out.println(book);
        }


        

    }
}
