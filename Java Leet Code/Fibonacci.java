public class Fibonacci {
    public static void main(String arg[]){
        int a=0,b=1,c;

        for(int i=0;i<10;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);

        }
    }
}
