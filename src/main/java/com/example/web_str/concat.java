package com.example.web_str;

import java.util.Scanner;

public class concat {
    public String type1(String a, String b){
        return a+b;
    }
    public String type2(String a, int n){
        String res="";
        for(int i=0;i<n;i++){
            res+=a;
        }
        return res;
    }
}