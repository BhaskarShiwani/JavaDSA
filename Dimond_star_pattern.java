import java.util.Scanner;

public class Dimond_star_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
        for(int i = 0;i < n; i++){
            //spaces
            for(int k = 0; k < n-i-1; k++){
                System.out.print(" ");
            }
            //star
            for(int j = 0; j < (2*i)+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0;i < n; i++){
            //space
            for(int k = 0; k < i; k++){
                System.out.print(" ");
            }
            //Loop for star
            for(int j = 0; j < (3*3)-(2*i); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
