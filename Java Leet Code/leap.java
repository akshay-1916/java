import java.util.Scanner;

public class leap {
    public static void main(String arg[]){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the year:");
        int y=a.nextInt();

        if((y%4==0 && y%100!=0) || y%400 ==0){
            System.out.println("leap ");
        }
        else{
            System.out.println("NOt leap");
        }
    }
}
