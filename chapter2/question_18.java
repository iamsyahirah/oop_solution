package oop_chap2;

import java.util.*;
import javax.swing.*;

public class OOP_chap2 {
  
    public static void main(String[] args) {
      
        JFrame myWindow;
     
        myWindow = new JFrame();
     
       String firstName, lastName;
     
       Scanner scanner = new Scanner(System.in);
     
       System.out.print("Enter your first name: " );
       firstName = scanner.next();
   
       System.out.print("Enter your last name: " );
       lastName = scanner.next();
     
       System.out.println("Your full name is: " + firstName + " " + lastName);
     
       myWindow.setSize(300,200);
       myWindow.setTitle(lastName + "," + firstName);
       myWindow.setVisible(true);
     
    }
    
}
