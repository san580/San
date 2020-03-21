package com.company;

import java.util.Scanner;

public class Area {

    public double returnArea(double length,double breadth) {
        double Area=length*breadth;
        return Area;

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Length of the rectangle: ");
        double length= input.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        double breadth=input.nextDouble();
        Area area1=new Area();
        double answer=area1.returnArea(length,breadth);

        System.out.println("Area of the rectangle: "+answer);
    }




}
