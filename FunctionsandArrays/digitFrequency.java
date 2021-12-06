import java.util.*;

public class digitFrequency {

    public static void digitArray(int[] arr,int x){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                c++;
            }
        }
        System.out.print(c);
    }
   
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        digitArray(arr,b);
       
    }
}
