//import java.util.Scanner;
//public class index {

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter the number you want to add to perform the arithmetic operation :");
//        int a = input.nextInt();
//        int b = input.nextInt();
//      System.out.println("the sum of two numbers will be:"+(a+b));
//    }
//}
// finding the largest of three numbers 
import java.util.Scanner;
public class index {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Give three numbers to compare");

    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    if(a>b && a>c){
      System.out.println(a+" that is `a` is the greatest among all of them ");

    }
    else if(b>a && b> c){
      System.out.println(b+" that is `b` is the greatest number among all the three numbers");

    }
    else{
      System.out.println(c+" that is `C` is the greatest number");
    }

  }
}