package com.example.web_str;
import static org.junit.jupiter.api.Assertions.*;

class concatTest {

    @org.junit.jupiter.api.Test
    void type1() {
        String a = "temp1";
        String b = "temp2";
        String result = "temp1temp2";
        assertEquals(new concat().type1(a,b),result);
    }

    @org.junit.jupiter.api.Test
    void type1() {
        String a = "123";
        String b = "456";
        String result = "123456";
        assertEquals(new concat().type1(a,b),result);
    }

    @org.junit.jupiter.api.Test
    void type1() {
        String a = "something go ";
        String b = "wrong";
        String result = "something go wrong";
        assertEquals(new concat().type1(a,b),result);
    }

    @org.junit.jupiter.api.Test
    void type1() {
        String a = "no ";
        String b = "way";
        String result = "no way";
        assertEquals(new concat().type1(a,b),result);
    }


    @org.junit.jupiter.api.Test
    void type2() {
        String a = "bla";
        int b = 3;
        String result = "blablabla";
        assertEquals(new concat().type2(a,b),result);
    }


    @org.junit.jupiter.api.Test
    void type2() {
        String a = "bla";
        int b = 2;
        String result = "blabla";
        assertEquals(new concat().type2(a,b),result);
    }



    @org.junit.jupiter.api.Test
    void type2() {
        String a = "bla";
        int b = 6;
        String result = "blablablablablabla";
        assertEquals(new concat().type2(a,b),result);
    }
}