import java.util.Scanner;
import java.util.*;
public class ReverseNumber{
    
    private int reverseNumber(int n){
        int reverse=0;
        while(n != 0)
        {
             reverse = reverse * 10;
            reverse = reverse + n%10;
            n = n/10;
        }
        return reverse;
    }
    
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    ReverseNumber rn = new ReverseNumber();
    System.out.println(rn.reverseNumber(sc.nextInt()));
}
}
