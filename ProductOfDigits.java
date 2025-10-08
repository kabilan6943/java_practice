import java.util.Scanner;
class ProductOfDigits{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int pro=1;
while(a>0){
int r=a%10;
pro*=r;
a/=10;
}System.out.print(pro);
sc.close();
}
}