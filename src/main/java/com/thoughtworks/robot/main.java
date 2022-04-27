package com.thoughtworks.robot;

import java.util.Scanner;

public class main {
    public static void main(String args[]){

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter x coordinate of position:");
        int x=scan.nextInt();
        System.out.println("Enter y coordinate of position:");
        int y=scan.nextInt();
        System.out.println("Enter current direction:");
        char direction=scan.next().charAt(0);
        System.out.println("Enter the path string:");
        String path=scan.next();

        Robot r=new Robot(x,y,direction);
        r.moveToFinalPosition(path);
        r.displayCurrentPosition();
    }
}
