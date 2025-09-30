import java.util.*;
class Magic{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0,rem=0;

	
while(n>0||sum>9){
if(n==0){
n=sum;
sum=0;
}
    rem=n%10;
    sum+=rem;
    n/=10;

}if(sum==1)
System.out.print("Magic Number");
else
System.out.print("Not a Magic Number");
sc.close();
}
}