package challenges;

import java.util.Scanner;

public class DataTypes {

    private static DataTypes dataTypes = null;

    private DataTypes() {
    }

    public static DataTypes getInstance() {
        if (dataTypes == null) dataTypes = new DataTypes();
        return dataTypes;
    }

    public static void verification() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println("* byte");
                //Complete the code
                //Short
                if (x >= -Math.pow(2, 16)
                        && x <= Math.pow(2, 16) - 1) {
                    System.out.println("* short");
                }

                //int 32
                if (x >= -Math.pow(2, 32)
                        && x <= Math.pow(2, 32) - 1) {
                    System.out.println("* int");
                }

                //long is a 64
                if (x >= -Math.pow(2, 64)
                        && x <= Math.pow(2, 64) - 1) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}
