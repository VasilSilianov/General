import java.util.Scanner;

public class JavaIntToString {
    public static void main(String[] args) {

        //DoNotTerminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();
            /**
             * The line below is the solution of the task
             */
            String s= ""+n; //???; Complete this line below

            //Write your code here


            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (Exception e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}
