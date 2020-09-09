package ru.mirea.ikbo0819.pr1;
import java.lang.*;

public class Ball {
    private String Colour;
    private double Radius;

    public Ball(String colour, double radius){
        Colour = colour;
        Radius = radius;
    }

    public Ball(String colour){
        Colour = colour;
    }

    public Ball(double radius){
        Radius = radius;
    }

    public String getColour(){
        return Colour;
    }

    public double getRadius(){
        return Radius;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "Colour='" + Colour + '\'' +
                ", Radius=" + Radius +
                '}';
    }
}
