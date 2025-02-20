import java.util.Scanner;

public class cross_sta_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = n;
        //upper cross
        int N = (n/2)+1;
        for(int i = 0; i < N; i++){
            //spaces
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            //star
            for(int k = 0; k < 1; k++){
                System.out.print("*");
            }
            //spaces
            s = s-2;
            for(int j = 0 ; j < s; j++){
                System.out.print(" ");
            }
            //star
           if(i != n/2 )
           {
                for(int k = 0; k < 1; k++){
                    System.out.print("*");
                }
           }
            System.out.println();
        }
        //lower half
        N = (n/2);
        for(int i = 0; i < N; i++){
            //spaces
            for(int j = 1; j < N-i; j++){
                System.out.print(" ");
            }
            //star
            for(int k = 0; k < 1; k++){
                System.out.print("*");
            }
            //spaces
            for(int j = 0; j < (2*i)+1 ; j++){
                System.out.print(" ");
            }
            //star
            for(int j = 0; j < 1;  j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
