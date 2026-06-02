public class LinearSearch {
    public static void main(String arg[]){
        int[] a={1,2,7,3,4,9,3,9};
        int k=4;
        for(int i:a){
            if(a[i]==k){
                System.out.println(k+"   Found at "+(i+1)+" Position");
            }
        }
    }
}
