package Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Address myAdres = new Address();
        System.out.println("Enter your country");
        myAdres.setCountry(in.nextLine());
        System.out.println("Enter your post index");
        myAdres.setIndex(in.nextLine());
        System.out.println("Enter your city");
        myAdres.setCity(in.nextLine());
        System.out.println("Enter your street");
        myAdres.setStreet(in.nextLine());
        System.out.println("Enter number of your house");
        myAdres.setHouse(in.nextLine());
        System.out.println("Enter number of your apartment");
        myAdres.setApartment(in.nextLine());
        System.out.println("Your full addres is\n" + myAdres.getCountry() + ", " + myAdres.getIndex() + ", " + myAdres.getCity() + ", "
                + myAdres.getStreet() + ", " + myAdres.getHouse() + ", " + myAdres.getApartment());

    }
}
