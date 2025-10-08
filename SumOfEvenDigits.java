import java.util.Scanner;
class SumOfEvenDigits{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int sum=0;
while(a>0){
int e=a%10;
if(e%2==0){
sum+=e;
}
a/=10;
}System.out.print(sum);
sc.close();
}
}