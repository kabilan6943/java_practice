import java.util.Scanner;
public class mileagecalc 
{

    public static void main(String[]args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of miles traveled: ");
        int miles = sc.nextInt();
        int rate = 25;
        int remuneration = miles * rate;
        System.out.println("Mileage remuneration is: Rs." + remuneration);
        sc.close();
    }
}

    
    

