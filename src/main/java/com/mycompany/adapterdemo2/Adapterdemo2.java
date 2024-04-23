package com.mycompany.adapterdemo2;

import com.mycompany.adapterdemo2.shape.RectInterface;
import com.mycompany.adapterdemo2.shape.Rectangle;
import com.mycompany.adapterdemo2.shape.TriInterface;
import com.mycompany.adapterdemo2.shape.Triangle;

public class Adapterdemo2 {

    public static void main(String[] args) {
        System.out.println("*** A Anapter demo 2 ***\n");
        System.out.println("Initially, printing the details of both shapes.\n");
        
        RectInterface rectangle = new Rectangle();
        System.out.println("The rectangle.AboutMe() says:");
        rectangle.aboutMe();
        
        TriInterface triangle = new Triangle();
        System.out.println("The triangle.Triangle() says:");
        triangle.aboutTriangle();
        
        System.out.println("\nNow using the adapter.");
        
        RectInterface adapter = new Adapter();
        System.out.println("The adapter.aboutMe() says:");
        adapter.aboutMe();
    }
}
