package challenges;

import java.util.Scanner;

public class EndOfFile {

    public void readFromSystemIn() {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (scanner.hasNext()) {
            i++;
            System.out.printf("%d %s\n",i, scanner.nextLine());
        }
    }
}
