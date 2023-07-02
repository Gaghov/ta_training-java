package com.epam.training.student_Gagik_Hovhannisyan.figures;


class Circle extends Figure{
    Point center;
    double radius;
    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }
    @Override
    public double area() {
        return (Math.PI)*radius*radius;
    }
    @Override
    public String pointsToString() {
        return "("+center.getX()+","+center.getY()+")";
    }
    @Override
    public String toString() {
        return "Circle[("+center.getX()+","+center.getY()+")"+radius+"]";
    }
    @Override
    public Point leftmostPoint() {
        return new Point(center.getX()-radius, center.getY());
    }
}