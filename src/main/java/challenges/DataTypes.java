package challenges;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataTypes {

    private static DataTypes dataTypes = null;

    private DataTypes() {
    }

    public static DataTypes getInstance() {
        if (dataTypes == null) dataTypes = new DataTypes();
        return dataTypes;
    }

    public void verification() {
        List<String> listTestLines = new ArrayList<>();
        try {
            String resourceName = "test/data-type-test-case1.txt";

            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource(resourceName).getFile());

            listTestLines = Files.lines(file.toPath())
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : listTestLines) {
            try {
                long x = Long.parseLong(s);
                System.out.println(x + " can be fitted in:");

                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) System.out.println("* byte");
                if (x >= Short.MIN_VALUE && x <= Byte.MAX_VALUE) System.out.println("* short");
                if (x >= Integer.MIN_VALUE && x <= Integer.MIN_VALUE) System.out.println("* int");
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) System.out.println("* long");

            } catch (Exception e) {
                System.out.println(s + " can't be fitted anywhere.");
            }

        }
    }
}
