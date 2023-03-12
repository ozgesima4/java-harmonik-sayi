package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
       double harmonik,top=0.0;
        System.out.println("harmonik seri sayisi:");
        harmonik=input.nextInt();
        
        for (double i = 1; i <=harmonik ; i++) {
            top +=(1/i);
        }
        System.out.println(top);
    }
    
}
