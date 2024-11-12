/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vivaq1;


import java.util.Scanner;
public class VivaQ1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        if (num<0){
            System.out.println("Please enter a positive number.");
            return;
        }
        
        else{
            int sum = num;
            while (sum >= 10){
                int ans= 0 ;
                for(int i=sum ; i>0; i/=10){
                    ans+=i%10;
                }
                sum = ans;
            }
        
        System.out.print("Sum of digits until single digit: "+sum);
        }
    }
}
