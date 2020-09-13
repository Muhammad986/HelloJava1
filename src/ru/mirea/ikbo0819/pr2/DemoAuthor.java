package ru.mirea.ikbo0819.pr2;

import java.lang.*;
public class DemoAuthor {
    public static void main(String[] args) {
        Author c1 = new Author("Lev Nikolayevich Tolstoy",
                'f',
                "lNikolayTol@somewhere.com");
        Author c2 = new Author("Andrey Bely",'?',"aBely@somewhere.com");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println("name is: " + c1.getName());
        System.out.println("gender is: " + c1.getGender());
        System.out.println("gender: " + c1.getEmail());
    }
}
