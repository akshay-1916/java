public class Factorial {
    public static int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }

    public static void main(String ar[]){
        int num=4;
        System.out.println(fact(num));
    }
}
