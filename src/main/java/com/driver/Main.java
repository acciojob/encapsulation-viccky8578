package com.driver;

public class Main {
    public static void main(String[] args)
    {
        RWOnly rw=new RWOnly();
       // rw.name("vikram");
        rw.setName("vikram");
      // System.out.println( rw.getName());
        rw.getName();

    }
  
}