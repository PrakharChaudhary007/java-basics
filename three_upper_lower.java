import java.util.Scanner;
public class three_upper_lower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        if(ch>='a' && ch <='z'){
            System.out.println("Lowercse");
        }else{
            System.out.println("Uppercase");
        }
    }
}
