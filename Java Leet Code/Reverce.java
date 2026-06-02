public class Reverce
{
    public static void main(String arg[]){
        String s="Akshay";
        String r="";

        for(int i =s.length()-1;i>=0;i--){
            r=r+s.charAt(i);
        }
        System.out.println(r);
    }
}
