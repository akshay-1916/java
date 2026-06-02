public class prime {
    public static void main(String arg[]){
        int n=12;
        boolean isp=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isp=false;
                break;
            }
        }
        System.out.println(isp ? "prime": "Not Prime");
    }
}
