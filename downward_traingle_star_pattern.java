import java.util.Scanner;

public class downward_traingle_star_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){  //for each row
            for(int j = 0; j < n - i ; j++){
                System.out.print("*"); //for each column to print star
            }
            System.out.println();
        }
        sc.close();
    }
}
