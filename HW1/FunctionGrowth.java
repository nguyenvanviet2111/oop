import java.util.Scanner;
public class FunctionGrowth {
    public static void main(String[] args){
        for(long i = 2; i <= 2048; i*=2){
            System.out.print((int)Math.log(i) );
            System.out.print('\t');
            System.out.print(i);
            System.out.print('\t');
            System.out.print((int)(i*Math.log(i)));
            System.out.print('\t');
            System.out.print(i*i );
            System.out.print('\t');
            System.out.print(i*i*i);
            System.out.println();
        }
    }
}
