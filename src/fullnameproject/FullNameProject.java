/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fullnameproject;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class FullNameProject {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      String FullName = (getFirstName() + " " + getMiddleName() + " " + getLastName());
      printFullName(FullName);
        
    }
    
   
    public static String getFirstName() {
        Scanner sc = new Scanner(System.in);
        String firstName = "";
        System.out.println("Enter your first name: ");
        firstName = sc.nextLine();
        return firstName;
        
    }
    
    public static String getMiddleName() {
        Scanner sc = new Scanner(System.in);
        String middleName = "";
        System.out.println("Enter your middle name: ");
        middleName = sc.nextLine();
        return middleName;
        
    }
    
    public static String getLastName() {
        Scanner sc = new Scanner(System.in);
        String lastName = "";
        System.out.println("Enter your last name: ");
        lastName = sc.nextLine();
        return lastName;
       
    }


    public static void printFullName(String FullName){
    
    System.out.println("Your full name is: " + FullName);
 
}
    
    
}
