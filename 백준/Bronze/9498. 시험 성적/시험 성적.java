import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        if(input >= 90){
            System.out.print("A");
        }else if(input >= 80){
            System.out.print("B");
        }else if(input >= 70){
            System.out.print("C");
        }else if(input >= 60 && input <= 69 ){
            System.out.print("D");
        }else{
            System.out.print("F");
        }
        
    }
}