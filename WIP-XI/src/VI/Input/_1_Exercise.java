/*
 * WIP XI Computer Programing 
 */

package VI.Input;

/**
 *
 * @author sittiwatlcp
 */

import java.util.Scanner;


public class _1_Exercise {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int x;
         int y;
         
        System.out.print("Enter x : ");

        x = sc.nextInt();
        
        System.out.print("Enter y : ");

        y = sc.nextInt();
               
        System.out.println("X+Y : " + (x+y));
    }
}
