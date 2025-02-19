import java.util.Scanner;

public class Butterfly_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //upper half portion
        for(int i = 0; i < n-1; i++){
            //star
            for(int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            //spaces
            for(int k = (n-1) - i; k > 0; k--){
                System.out.print(" ");
            }
            for(int j = (n-i)-2; j > 0; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //base line
        for(int i = 0; i < n*2-1; i++){
            System.out.print("*");
        }
        System.out.println();
        //lower half portion
        for(int i = 0 ; i < n - 1; i++){
            //star
            for(int j = 0; j < (n-i-1); j++){
                System.out.print("*");
            }
            //spaces
            for(int k = 0; k < i+1; k++){
                System.out.print(" ");
            }
            //spaces
            for(int k = 0; k < i; k++){
                System.out.print(" ");
            }
            //star
            for(int j = 0; j < (n-i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }
}
