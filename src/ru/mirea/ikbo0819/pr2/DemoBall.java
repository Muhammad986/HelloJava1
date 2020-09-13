package ru.mirea.ikbo0819.pr2;

public class DemoBall {
    public static void main(String[] args){
        Ball c1 = new Ball(99,99);
        System.out.println(c1);
        c1.move(36,27);
        System.out.println(c1);
    }
}
