package classes;

import java.util.Random;

public class Good {

    private static final String STR = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789";
    private static final int NUMBER_OF_SYMBOLS = 62;

    public static void getRandomString(int length) {
        Random random = new Random();
        StringBuilder randomString = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int number = random.nextInt(NUMBER_OF_SYMBOLS);
            randomString.append(STR.charAt(number));
        }

        System.out.println("\n" + randomString);
    }


}
