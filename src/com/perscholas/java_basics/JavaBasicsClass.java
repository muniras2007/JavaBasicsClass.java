package com.perscholas.java_basics;



public class JavaBasicsClass {

//1. Write a program that declares 2 integer variables, assigns an integer to each, and adds them together.
// Assign the sum to a variable. Print out the result.

    public static void main (String arg[]) {
        // int x = 8;
        // int y = 7;
        //int z = x + y;
        // System.out.println(z);


        //2.Write a program that declares 2 double variables, assigns a number to each, and adds them together.
        //             Assign the sum to a variable. Print out the result.
        // double r= 8.17;
        // double s= 7.54;
        //double t= r+s;
        //    System.out.println(t);

        //3.Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
        //Assign the sum to a variable. Print out the result. What variable type must the sum be?

       // int f = 8;
        //double g = 3.25;
        //double h = f + g;
       // System.out.println(h);

      //4.  Write a program that declares 2 integer variables, assigns an integer to each, and divides the larger number by the smaller number.
       // Assign the result to a variable.
       // Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?

               // int a = 15;
               // int b = 5;
               // int c = a/b;
               // System.out.println(c);
                //gives error when larger number is decimal. Need to change data type to double.

        //5.Write a program that declares 2 double variables, assigns a number to each, and divides the larger by the smaller.
        // Assign the result to a variable.
        // Print out the result. Now, cast the result to an integer. Print out the result again.
                   //double a = 25.65;
                 //   double b = 18.25;
                   //double c = a/b;
                   //System.out.println(c);


                    //int myInt = (int)c;
                   // System.out.println(myInt);
        //6.Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y.
        //Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign to q. Print q again.
         //int x = 5;
         //int y = 6;
         //int q = y/x;

         //System.out.println(q);
        //double newY = (double) y;
        //double newQ = newY;
        //System.out.println(newQ);

        //7.Write a program that declares a named constant and uses it in a calculation. Print the result.
            // double pi = 3.14;
             //int radius = 7;
            // double area  = radius*2*pi;
             //System.out.println(area);


//       8.Write a program where you create 3 variables that represent products at a cafe.

            double cake  = 4.50;
            double coffee = 2.50;
            double sandwich = 5.99;

             double   subTotalCake = 4.50*3;
             double subTotalCoffee = 2.50*4;
             double subTotalSandwich =5.99*2;

             double   subTotal = subTotalCake+subTotalCoffee+subTotalSandwich;

             double Sales_Tax = 0.06*subTotal;

             double totalSale = Sales_Tax+subTotal;
        System.out.printf("%.2f",totalSale);

//         The products could be beverages like coffee, cappuccino, espresso, green tea, etc.Assign prices to each product.
//         Create 2 more variables called subtotal and totalSale and complete an “order” for 3 items of the first product, 4 items of the second product, and 2 items of the third product.
//         Add them all together to calculate the subtotal.
//         Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
//         Be sure to format the results to 2 decimal places.





    }

}