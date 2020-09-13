package ru.mirea.ikbo0819.pr2;

import java.lang.*;
public class Author {
    private String Name;
    private String Email;
    private char Gender;

    public Author(String name, char gender, String email){
        Name = name;
        Email = email;
        Gender = gender;
    }

    public String getName() {
        return Name;
    }

    public char getGender() {
        return Gender;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return Name + "(" + Gender + ") at " + Email;
    }
}
