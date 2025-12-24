import java.util.Scanner;
public class repitition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int data = 1385757879;
        int n = input.nextInt();
        int count =0;
        while(data >= 10){
             int r = data % 10;
             if(r==n){
                count++;
             }
             data = data /10;
        }
        System.out.println(count);
        
    }
}
