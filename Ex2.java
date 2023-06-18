/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Admin
 */
public class Ex2 {   
     
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        int[] arr = new int[100];
        int start;
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter start of arr: ");
        start = sc.nextInt();
        
         int i,n;
         n = start;
         for (i=0; i<100; i++) {
             arr[i] = n;
             n++;
         }
         int sum  = 0;
         for(i=0; i<100; i++) {
             if (arr[i] % 2 == 0) {
                 sum += arr[i];
             }
         } System.out.println("Sum of even integers in arr: " + sum);
        
         executor.submit(() -> {
            return null;
        });
        
        executor.shutdown();

        while (!executor.isTerminated()) {
            
        }
    }
}
    

