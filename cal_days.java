import java.util.*;
public class cal_days {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year_in_days=365;
        int month_in_days=30;
        int days=sc.nextInt();
        int years=days / year_in_days;
        int rem=days%year_in_days;
        int month=rem/month_in_days;
        int rem_days=rem%month_in_days;
        System.out.println("years: "+years);
        System.out.println("month: "+month);
        System.out.println("days: "+rem_days);
        sc.close();
    }
}
