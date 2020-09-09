package ru.mirea.ikbo0819.pr1;
import java.lang.*;

public class Book {
    private String Name;
    private double Ves;
    private int Page;
    private int Vib;

    public Book(String name, double ves, int page, int vib){
        Name = name;
        Ves = ves;
        Page = page;
        Vib = vib;
    }

    public Book(String name, int page, int vib){
        Name = name;
        Page = page;
        Vib = vib;
    }

    public String getName(){
        return Name;
    }

    public void setName(String name){
        Name = name;
    }

    public double getVes(){
        return Ves;
    }

    public void setVes(double ves){
        Ves = ves;
    }

    public int getPage() {
        return Page;
    }

    public void setPage(int page) {
        Page = page;
    }
    public int getVib(){
        return Vib;
    }

    public void setVib(int vib){
        Vib = vib;
    }

    public void Vibor(){
        if(Vib == 1){
            System.out.println("Book " + Name + " weighs " + Ves + " gram and has " +
                    Page + " pages");
        }
        if(Vib == 2){
            System.out.println("Book " + Name + " has " +
                    Page + " pages, but its weight is unknown.");
        }

    }
}
