
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class Main {
   public static void main(String[] args ){
       //scanner/ inputs
       /*
       Scanner input = new Scanner(System.in);

       System.out.println("What is your name? ");
       String name = input.nextLine();
       System.out.println("How old are you? ");
       int age = input.nextInt();
       input.nextLine(); //for the sake of the dish and next line rules
       System.out.println("What is you fave' dish? ");
       String dish = input.nextLine();

       System.out.println("Hello " + name);
       System.out.println("You are " +age +" years old");
       System.out.println("You like "+ dish);
*/
       // operators + * /%

      /* int friends = 2;

       friends = friends + 1;
       //or
       friends++;
       friends--;

       //division
       double friend = 10;
       friend = (double) friend /3;

       System.out.println(friend); */



       /*
       double x= 3.14;
       double y = 20;
  there are a few Math. something's for math related tasks

       double z = Math.min(x, y);
       double z = Math.max(x, y);
       double z =  Math.sqrt(y);*/


//HYPOTENUSE TASK

//       double x;
//       double y;
//       double z;
//
//       Scanner input = new Scanner(System.in);
//
//       System.out.println("Enter size x: ");
//       x = input.nextDouble();
//       System.out.println("Enter side y: ");
//       y = input.nextDouble();
//
//       z = Math.sqrt((x*x) + (y*y));
//       System.out.println("The Hypotenuse is : " +z);
//
//       input.close();

//       RANDOM VALUES

       Random randomValue = new Random();
//       int x = randomValue.nextInt(6)+1;
//       double x = randomValue.nextDouble();
       boolean x = randomValue.nextBoolean();
       System.out.println(x);






    }
}