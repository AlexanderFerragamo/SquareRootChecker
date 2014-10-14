/**
*
* Prompts user to enter a value, checks if negative -- if not, prints out the square root
*
* @author <Alexander Ferragamo>
* @version <october 14>
*
*/

import java.util.Scanner;

public class SquareRootChecker{

   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      System.out.println("Input an integer: ");
      int int1 = scnr.nextInt();
      if (int1 > -1){
      System.out.println(Math.sqrt(int1));
      } else {
      System.out.println("Error!");
      }
      
      
      
      }
      }