
    import java.util.Scanner;
public class Neon {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       int abc=sc.nextInt();
       int ghf=abc*abc;
       int sum=0;
       while(ghf>0){
        int dig=ghf%10;
        sum+=dig;
        ghf/=10;
       }
       if(abc==sum)
       System.out.println("neon");
       else
       System.out.println("not a neon");
        
sc.close();

    }
}

