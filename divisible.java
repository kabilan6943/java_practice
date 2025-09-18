import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
     if((a%3==0) && (a%5==0))
        System.out.println("The "+a+" is divisible by 3&5");
        else
        System.out.println("The "+a+" is not divisible by 3&5");
sc.close(); 
    }
}
