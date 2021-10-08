import java.util.Scanner;

public class JavaStaticInitializerBlock {

    /**
     * this is my initial solution
     */

//    public static int Area(int B, int H) throws Exception {
//        if (B <= 0 || H <= 0) {
//            throw new Exception("java.lang.Exception: Breadth and height must be positive");
//
//        }
//        return B * H;
//
//
//    }

    //    public static void main(String[] args) throws Exception {
//        Scanner input = new Scanner(System.in);
//        System.out.println(Area(input.nextInt(),input.nextInt()));
//    }

    /**
    This is the solution that hacker rank required.
     The idea of the task is to work with static block and static variables
     not to find the Area of the parallelogram
     */
    static boolean flag = false;
    static int B;//= input.nextInt();
    static int H;//= input.nextInt();

    static {
        Scanner input = new Scanner(System.in);

        B = input.nextInt();
        H = input.nextInt();
        if (B > 0 && H > 0) {
            flag = true;
        } else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }


    public static void main(String[] args) {
        //boolean flag;
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of clas


