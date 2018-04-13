package com.itschool;

public class Figure {
    Point[] points;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;

    public Figure() {
    }

    public Figure(String title, Point point0, Point point1, Point point2) {
        this.title = title;
        points = new Point[3];
        this.points[0] = point0;
        this.points[1] = point1;
        this.points[2] = point2;
    }

    public Figure(String title, Point point0, Point point1, Point point2, Point point3) {
        this.title = title;
        points = new Point[4];
        this.points[0] = point0;
        this.points[1] = point1;
        this.points[2] = point2;
        this.points[3] = point3;
    }

    public Figure(String title, Point point0, Point point1, Point point2, Point point3, Point point4) {
        this.title = title;
        points = new Point[5];
        this.points[0] = point0;
        this.points[1] = point1;
        this.points[2] = point2;
        this.points[3] = point3;
        this.points[4] = point4;
    }

    public double CalculateSideLength(Point p1, Point p2) {
        return Math.sqrt((p1.getX() - p2.getX()) * (p1.getX() - p2.getX()) + (p1.getY() - p2.getY()) * (p1.getY() - p2.getY()));
    }

    public String toString()
    {
        String result = "";
        result = this.getTitle();
        for (Point p: points) {
            result = result + "\n" + p.toString();
        }
        return result;
    }

    public double CalculatePerimeter()
    {
        double result = 0;

        for (int i = 0; i < points.length; i++) {
            result += CalculateSideLength(points[i], points[(i+1)%points.length]);
        }

        return result;
    }
}
