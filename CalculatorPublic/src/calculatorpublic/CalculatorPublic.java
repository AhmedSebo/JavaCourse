/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorpublic;
import java.util.Scanner;
/**
 *
 * @author Ahmad
 */
public class CalculatorPublic {
dsds
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner scn= new Scanner (System.in);
        System.out.println("Hello, welcome to the Calculator");
        System.out.println("Enter the 1st number");
        int n1= scn.nextInt();
        System.out.println("Enter the 2nd number");
        int n2= scn.nextInt();
        
        
        int result= n1+n2;
        System.out.println("The sum is: " +result);
        System.out.println("By Ahmed Hamdan");
        System.out.println("Basel");
        
    }
    
}
