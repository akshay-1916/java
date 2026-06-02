public class Fibonacci3 {
    public static int f(int n){
        if(n<=1) return n;
        return f(n-1)+f(n-2);
    }
    public static void main(String arg[]){
        int n=10;
        for(int i=0;i<n;i++){
            System.out.println(f(i)+"   ");
        }
    }
}
