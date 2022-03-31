/**
* Java 1. Homework 3
*
* @author Evgeny Pastukhov
* version 31.03.2022
*/

import java.util.Arrays;

class Lesson3 {
    public static void main(String[] args) {
        int a[] = {1,0,0,0,1,1,0,1,0,1};
        a = changeArr(a);
        System.out.println(Arrays.toString(a));
        
        int[] b = new int[100];
        b = fillArr(b);
        System.out.println(Arrays.toString(b));
        
        int c[] = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        c = change2Arr(c);
        System.out.println(Arrays.toString(c));
        
        int[][] d = new int[3][3];
        d = diagonalArr(d);
        for (int i = 0;i < d.length;i++) {
            System.out.println(Arrays.toString(d[i]));
        }
        
        System.out.println(Arrays.toString(createArr(5,10)));
    }
    
    static int[] changeArr(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {a[i]=1;} else {
                a[i] = 0;
            }
        }
        return a;
    }
    
    static int[] fillArr(int b[]) {
        for (int i = 0; i < b.length; i++) {
            b[i] = i+1;
        }
        return b;
    }
    
    static int[] change2Arr(int c[]) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] < 6) {c[i] = c[i]*2;
            }
        }
        return c;
    }
    
    static int[][] diagonalArr(int d[][]) {
        for (int i=0; i < d.length; i++) {
            d[i][i] = 1;
        }
        return d;
    }
    
    static int[] createArr(int initialValue, int len) {
        int[] e = new int[len];
        for (int i = 0;i < len; i++) {
            e[i] = initialValue;
        }
        return e;
    }
}