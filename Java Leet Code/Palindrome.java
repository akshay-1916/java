public class Palindrome {
    public static void main(String arg[]){
        String a="akska";
        String b="";

        for(int i=a.length()-1;i>=0;i--){
            b+=a.charAt(i);
        }

        System.out.println(a.equals(b)? "Palindrome" : "Not Palindrome");
    }
}
