package com.itschool;

public class Point {
    private double x;
    private double y;
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point()
    {
        this.x = 0;
        this.y = 0;
        this.title = "Noname point";
    }

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
        this.title = "Noname";
    }

    public Point(double x, double y,  String ... title) {
        this.x = x;
        this.y = y;
        this.title = "";
        for (String str: title)
        {
            this.title = this.title + " " + str;

        }

    }

    public String toString()
    {
        return this.getTitle() + "( " + this.getX() + ", " + this.getY() + " )";
    }
}
