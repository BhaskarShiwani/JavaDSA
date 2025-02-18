import java.util.Scanner;

public class Hollow_squre_star_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            //always in first and last row
            if(i == 0 || i == n-1){
                //to print star
                for(int j = 0; j < n; j++){
                    System.err.print("*");
                }
                System.out.println();
            }
            else{
                if(i >= 1 && i < n-1){
                    for(int j = 0 ; j < n ; j++){
                        if(j == 0 || j == n - 1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
            sc.close();
        }
    }
}
