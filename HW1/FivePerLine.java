import java.sql.SQLOutput;

public class FivePerLine {
    public static void main(String[] args){

        int cnt = 0;

        for(int i = 1000; i <= 2000; i++){
            if(cnt < 5){
                cnt++;
                System.out.print(i + " ");
            }
            else {
                System.out.println();
                cnt = 0;
            }
        }

    }

}
