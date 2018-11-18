package com.company;

public class Main {

    public static void main(String[] args) {
	short[] array = new short [25];
	short x, y;
        System.out.println("Массив:");
        for (int i = 0; i<25; i++) {
            array[i]=(short)Math.round(25*Math.random());
            System.out.print(array[i]+", ");
        }
     x = array[0];
     y = array[0];
        for(int i = 1; i<25; i++) {
            if(x>array[i]) {
                x=array[i];
            } else if(y<array[i]) {
                y=array[i];
            }
        }
        System.out.println("\n" + x + ", " + y);
        x+=y;
        y = (short) (x - y);
        x-=y;
        System.out.println(x + ", " + y);
    }
}
