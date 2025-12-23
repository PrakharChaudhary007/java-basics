// printing n th fibonacci series 0+1+1+2+3+5+8......
import java.util.Scanner;
public class fibbo {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int a = 0;
    int b = 1;
    int next=4;
    int prev=a+b;
    int curr=0;
    while (next<=n) {
        curr = prev+b;
        b = prev;
        prev = curr;
        next++;
    }
    System.out.println(curr);
   } 
}
