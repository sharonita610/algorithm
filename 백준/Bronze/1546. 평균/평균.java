import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        
        double sum=0;
        double max=arr[0];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextDouble();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = (arr[i]/max)*100;
            sum+=arr[i];
        }
        double avg =sum/n;
        System.out.println(avg);
    }
}