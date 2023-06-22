package com.company;
public class Main {
    public static void main(String[] args) {
        int a =24,b=16,c=9;
        if(a>b&&a>c){
            System.out.println(a+ " Is the greatest number");
        }
        else if(b>a&&b>c){
            System.out.println(b+ " Is the greatest number");
        }
        else {
            System.out.println(c+ " Is the greatest number");
        }
    }
}