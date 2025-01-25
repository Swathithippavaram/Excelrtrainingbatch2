import java.util.Scanner;
public class Demo036 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter a second number: ");
        int b = scanner.nextInt();
        System.out.println("Enter a third number: ");
        int c = scanner.nextInt();
        if(a>=b&&a>=c){
            System.out.println("The bigger number is: "+a);

        }else if(b>=a&&b>=c){
            System.out.println("This number is bigger: "+b);
        }else{
            System.out.println("the third number is bigger: "+c);
        }
    }
    
}
