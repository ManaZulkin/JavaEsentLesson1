package Task3;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter title of new book");
        Title title = new Title(in.nextLine());
        System.out.println("Enter name of the author");
        Author author = new Author(in.nextLine());
        System.out.println("Enter short description for this book");
        Content content = new Content(in.nextLine());
        System.out.println("\nYou created next book\n");
        author.show();
        title.show();
        content.show();
    }
}
