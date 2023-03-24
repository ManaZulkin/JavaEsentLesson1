package Task2;

import java.util.Scanner;
//Не бачу необхідності у створенні змінних для сторін прямокутника в даному випадку
//Можна зробити через конструктор та змінні зі значеннями сторін, але мені данний варіант з сетерами
//більш до вподоби
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Rectangle Rect = new Rectangle();
        System.out.println("Enter first side of rectangle");
        Rect.setSide1(in.nextDouble());
        System.out.println("Enter Second side of rectangle");
        Rect.setSide2(in.nextDouble());
        System.out.println("Perimeter of this rectangle is " + Rect.perimetrCalculator());
        System.out.println("Area of this rectangle is " + Rect.areaCalculator());
    }

}
