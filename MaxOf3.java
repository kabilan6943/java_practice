import java.util.Scanner;
class MaxOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println(Math.max(a, Math.max(b, c)));
   sc.close();       
    }
}
