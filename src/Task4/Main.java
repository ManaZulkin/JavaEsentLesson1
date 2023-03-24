package Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Computer[] computers = new Computer[5];
        for (int i = 0; i < 5; i++){
            System.out.println("Enter user name");
            computers[i] = new Computer(in.nextLine(), i);
        }
        System.out.println("You created groop of computers with usernames:");
        for (int i =0; i < 5; i++) computers[i].showCumputer(i);
    }
}
