 import java.util.*;
 class digitsLeftToRight{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printDigitsRightToLeft(n);
        sc.close();
    }
   
static void printDigitsRightToLeft(int n) {
        while (n > 0) {
            System.out.print(n % 10 + " ");
            n /= 10;
        }
        System.out.println();
    }
}