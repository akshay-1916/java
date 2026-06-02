public class Fibonacci2 {
    public static void f(int n){
        int a=0,b=1,c;
        for(int i=0;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
    public static void main(String arg[]){
        f(10);
    }
}
