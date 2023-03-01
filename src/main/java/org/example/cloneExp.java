package org.example;

import java.util.*;

class point implements Cloneable {
    int x1, y1;

    point(int x, int y) {
        x1 = x;
        y1 = y;
    }

    public Object clone() throws CloneNotSupportedException

    {
        return super.clone();
    }

    boolean equals(int x, int y) {
        boolean result = ((x1 == x) && (y1 == y)) ? true : false;
        return result;
    }
}
class cloneExp {
    public static void main(String args[]) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter 1st Points : \n");
        System.out.println("\n Enter X  : ");
        int x = sc.nextInt();
        System.out.println("Enter Y : ");
        int y = sc.nextInt();

        point ob = new point(x, y);
        point ob1 = (point) ob.clone();

        System.out.println("\nEnter 2nd points: \n");
        System.out.println("\nEnter X : ");
        int A = sc.nextInt();
        System.out.println(" Enter Y : ");
        int B = sc.nextInt();

        boolean ans = ob1.equals(A, B);

        System.out.println(" the both points are " + (ans ? "same" : "not same"));



    }
}