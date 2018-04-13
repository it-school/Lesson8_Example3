package com.itschool;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(0, 3);
        System.out.println("( " + p1.getX() + ", " + p1.getY() + " )");

        Point p2 = new Point(4, 0);
        System.out.println("( " + p2.getX() + ", " + p2.getY() + " )");

        Point p3 = new Point(0, 0, "A", "B", "C");
        System.out.println(p3.getTitle() + "( " + p3.getX() + ", " + p3.getY() + " )");
        System.out.println(p3.toString());

        Figure figs = new Figure("Triangle", p1, p2, p3);
        System.out.println(figs.CalculateSideLength(p1, p2));
        System.out.println(figs.toString());
        System.out.println(figs.CalculatePerimeter());

        Figure square = new Figure("Square", new Point(0, 0, "A"), new Point(0, 2,"B"), new Point(2, 2, "C"), new Point(2, 0, "D"));
        System.out.println(square.toString());
        System.out.println("Perimeter: " + square.CalculatePerimeter());
    }
}
