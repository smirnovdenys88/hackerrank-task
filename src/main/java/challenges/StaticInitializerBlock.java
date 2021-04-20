package challenges;

import java.util.Scanner;

public class StaticInitializerBlock {
    //Write your code here
    private static int B;
    private static int H;
    private static boolean flag = true;

    static{
        Scanner sc = new Scanner(System.in);

        B = sc.nextInt();
        H = sc.nextInt();

        if(B <= 0 || H <= 0){
            flag = false;
            try {
                throw new Exception("Breadth and height must be positive");
            } catch (Exception e) {
                System.out.println("java.lang.Exception: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main
}
