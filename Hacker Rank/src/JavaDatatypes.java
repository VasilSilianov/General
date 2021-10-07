import java.util.Scanner;

public class JavaDatatypes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sInputs = input.nextLine();
        int inputs = Integer.parseInt(sInputs);

        for (int i = 0; i <= inputs-1; i++) {
            String sInput = input.nextLine();
            try {
                long integer = Long.parseLong(sInput);
                if (integer >= -128 && integer <= 127) {
                    System.out.println(integer + " can be fitted in:");
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (integer >= -32768 && integer <= 32767) {
                    System.out.println(integer + " can be fitted in:");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (integer >= -2147483648 && integer <= 2147483647) {
                    System.out.println(integer + " can be fitted in:");
                    System.out.println("* int");
                    System.out.println("* long");
                } else {
                    System.out.println(integer + " can be fitted in:");
                    System.out.println("* long");
                }

            } catch (Exception e) {
                System.out.println(sInput + " can't be fitted anywhere.");
            }

        }
    }
}
