import java.util.Scanner;
public class IntegerToBinaryString {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String s = "";

        while(n != 0){
            s+= (char)('0' + n%2);
            n/=2;
        }
        System.out.println(s);
    }
}
