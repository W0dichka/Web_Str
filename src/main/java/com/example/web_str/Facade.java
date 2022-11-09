package com.example.web_str;
import java.util.Scanner;

public class Facade {
    String result;
    public int wrong(){
        int k;
        System.out.println("Repeat input of type");
        System.out.println("1 or 2");
        Scanner in = new Scanner(System.in);
        k=in.nextInt();
        while(k<1 || k>2){
            k = wrong();
        }
        return k;
    }
    public Facade(){
        int k;
        System.out.println("Enter type of the operation");
        System.out.println("1 or 2");
        Scanner in = new Scanner(System.in);
        k=in.nextInt();
        if(k<1 || k>2){
            k=wrong();
        }
        if(k==1){
            String a,b;
            a = in.next();
            b = in.next();
            result = new concat().type1(a,b);
        }
        else{
            String a;
            int n;
            a=in.next();
            n=in.nextInt();
            result = new concat().type2(a,n);
        }
    }
}