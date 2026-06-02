public class Test {
    static int  a=m1();
    public static int m1(){
        System.out.println("Hellow");
        return 10;
    }

    static {
        System.out.println("Sttic block");
    }

    public static void main(String arg[]){
        System.out.println("Main");
    }
}
