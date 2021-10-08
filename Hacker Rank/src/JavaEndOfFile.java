import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {

        String blank= null;
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder() ;
        int i =1;
        while (input.hasNextLine()){//!(blank = input.nextLine()).isEmpty()
            String currentLine = input.nextLine();
            if (currentLine.isEmpty()){
                break;
            }
            sb.append(i).append(" ").append(currentLine).append(System.lineSeparator());
            i++;
        }

        System.out.println(sb.toString());
    }


}
