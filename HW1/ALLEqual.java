import java.util.Scanner;
public class ALLEqual {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == b && b == c) {
            System.out.print("all equal");
        }
        else {
            System.out.print("not all equal");
        }
    }

}
