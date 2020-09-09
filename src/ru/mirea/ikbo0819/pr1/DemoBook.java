package ru.mirea.ikbo0819.pr1;
import java.lang.*;

public class DemoBook {
    public static void main(String[] args) {
        Book t1 = new Book("Dale Carnegie", 238, 352, 1);
        Book t2 = new Book( "War and Peace", 1300, 2);

        t1.Vibor();
        t2.Vibor();
    }
}
