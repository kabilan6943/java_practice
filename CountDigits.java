import java.util.Scanner;
class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(String.valueOf(Math.abs(n)).length());
        sc.close();
    }
}
