package ru.mirea.ikbo0819.pr2;

import java.lang.*;
public class DemoAuthor {
    public static void main(String[] args) {
        Author c1 = new Author("Lev Nikolayevich Tolstoy",
                'm',
                "lNikolayTol@somewhere.com");

        System.out.println(c1);
        System.out.println("name is: " + c1.getName());
        System.out.println("gender is: " + c1.getGender());
        System.out.println("gender: " + c1.getEmail());
    }
}
