import java.util.Scanner;
class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum=0;
        n = Math.abs(n);
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
        sc.close();
    }
}
