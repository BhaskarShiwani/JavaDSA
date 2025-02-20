import java.util.Scanner;

public class Hollow_pyramid_star_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n-1; i++){
            //spaces
            for(int j = 0 ; j < n - i - 1; j++){
                System.out.print(" ");
            }
            //star
            for(int k = 0; k < 1; k++){
                System.out.print("*");
            }
            //spaces
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            //spaces
            for(int k = 1; k < i; k++){
                System.out.print(" ");
            }
            //star
            if(i!=0){
                for(int k = 0; k < 1; k++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i = 0; i < (n*2)-1; i++){
            System.out.print("*");
        }
        sc.close();
    }
}
