import java.util.Scanner;

public class Demo035 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter a Second number: ");
        int b = scanner.nextInt();
        if(a>=b){
            System.out.println(a+ "is bigger number");

        }else if (b>=a){
            System.out.println(b+ " is bigger number");
        }else{
            System.out.println("both are equal");
        }
    }
    
}
