public class Vowels {
    public static void main(String arg[]){
         String s=" HII Akshay";
         int co=0;

         for(char c:s.toLowerCase().toCharArray()){
             if("aeiou".indexOf(c)!=-1) co++;
         }
         System.out.println(co);

    }
}
