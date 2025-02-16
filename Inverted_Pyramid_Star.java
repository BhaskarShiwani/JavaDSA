import java.util.Scanner;

public class Inverted_Pyramid_Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            //Loop for spaces
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
