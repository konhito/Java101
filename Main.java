/*public class Main{
    public static void main(String[] args){
        System.out.print("\"I love pizza\" \n");
        System.out.print("Its really good!");

        // This a Comment Please star
        
    }
}*/
/*public class Main {

 public static void main(String[] args){
  
  int x = 123;
  double y = 3.14;
  boolean z = true;
  char symbol = '@';
  String name = "Bro";
  
  System.out.println("Hello "+name);
  
 }
}*/

//methods
//calling methods
//scope
//addign parameter
//Reassigning Instance Fields
//Returns
//The toString() Method


//--------------------------------------------------------------------------------------


//conditionals in java

import java.net.Socket;
import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
        //  int salary = 24000;
        // if (salary > 1000) {
        //     salary += 200;

        // }else {
        //     salary += 100;
        // }
        // if(salary > 10000){
        //     salary += 2000;
        // }else if (salary >20000) {
        //     salary += 20000;
        // }
        // System.out.println(salary);

        
        // for (initialization ; condition ; increaemt and decrement){}
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();

        // for (int i = 1; i <=n;i++ ) {
        //     System.out.println(i);
        // } 
        // // WHILE LOOP
        // //while(condition){
        //     body
        // }
        // int n  =  1;
        // while ( n <=100){
        //     System.out.println(n);
        //     n++;
            
        // }
        // run while loop if u dont know how many time loop will run
        
        // run for loop if u know the intioal and end number

        // Scanner input = new Scanner(System.in);
        // int a = input.nextInt();
        // int b = input.nextInt();
        // int c = input.nextInt();


        // //Q: find the largest of the three number
        // int max = a;
        // if (b>max){
        //     max = b;
        // }else if (c > max) {
        //     max = c;
        // }

        // System.out.println(max + " IS the max number");

        //Q: CASE CHECK

    //     Scanner input = new Scanner(System.in);
    //     char ch = input.next().trim().charAt(0);

    //    if (ch > 'a' && ch <='z') {
    //     System.out.println("LOWERCASE");

    //    }else {
    //     System.out.println("UPPERCASE");
    //    }


 // // FIBONACHI NUMBER  =
     // Scanner in = new Scanner(System.in);
     // int n = in.nextInt();
     // int p = 0;
     // int count  = 2;

     // while (count <= n){
     //     int temp = i;
     //     i = i+p;
     //     p = temp;
     //     count++;

     // }
     // System.out.println(i);

    //  int n = 123487;
    //  int x = 0;

    //  while (n > 0 ){
    //     int rem = n % 10;
    //     n /= 10;

    //     x = x * 10 + rem;
    //  }


    //  System.out.println(x);
    //  int z = 112312312;
    //  z = z / 10;
    //  System.out.println(z);

    

//     }
// // } 

// public class Main {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int num1, num2,sum;

//         System.out.print("Enter your first number: ");
//          num1 = in.nextInt();
//         System.out.print("Enter yout Second number:  ");
//          num2 = in.nextInt();
//         sum = num1 + num2;
//         System.out.println("The Sum = "+ sum);


//     }
// }

public class Main{
    public static void main(String[] args) {
        
        // int ans = sum2();
        // System.out.println(ans);
        int ans = sum3(20,30);
        System.out.println(ans);

    }

    static int sum3(int a,int b){
        int sum = a + b;
        return sum;

    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter yout Second number:  ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;  //retuen means the functuon is over

    }


    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter yout Second number:  ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum = "+ sum);
    }
}