/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejava.com;
import java.util.Scanner;

/**
 *
 * @author OWNER
 */
public class CalcApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic he
        Scanner input = new Scanner(System.in);
        while(true)
        {
        System.out.println("Enter First Number");
        int FirstNo = input.nextInt();
        System.out.println("Enter Second Number");
        int SecondNo = input.nextInt();
        System.out.println("Enter Your Choice[1-6]");
        String choice = input.next();
        
        if(choice.equals("1"))
        {
            int add = FirstNo+SecondNo;
            System.out.println("Adition =" +add);
        }
        else if(choice.equals("2"))
        {
            int sub = FirstNo-SecondNo;
            System.out.println("Subtraction =" +sub);
        }
        else if(choice.equals("3"))
        {
            int div = FirstNo/SecondNo;
            System.out.println("Division =" +div);
        }
        else if(choice.equals("4"))
        {
            int mul = FirstNo*SecondNo;
            System.out.println("Multiplication =" +mul);
        }
        else if(choice.equals("5"))
        {
          double a=1;
         
            for(double i=1; i<=SecondNo; i=i+1.0)
            {
                a=a*FirstNo;
            }
            System.out.println("Power =" +a);
        }
        else if(choice.equals("6"))
        {
            System.exit(0);
        }
        
        System.out.println("Do you Want to continue[Y/N]");
        String Choice = input.next();
        if(Choice.equalsIgnoreCase("n"))
                {
                    System.exit(0);
                }
        }
    }
}