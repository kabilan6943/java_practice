import java.util.*;
public class Palindrom {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int tmp=num;
        int rev=0;
        while(num>0){
            int dig=num%10;
            rev=rev*10+dig;
            num/=10;
        }
        System.out.println(rev);
        if(rev==tmp)
        System.out.println("palindrom");
        else 
        System.out.print("Not a palindrom");
        sc.close();
    }   
}
