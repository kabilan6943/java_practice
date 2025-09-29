import java.util.*;
class StrongNumber{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int tmp=n;
int fact1=0,rem=0;

while(n>0){
rem=n%10;
int fact=1;
  for(int i=1;i<=rem;i++){
  fact*=i;
}
  fact1+=fact;
  n/=10;
}
if(tmp==fact1)
System.out.print("Strong Number");
else
System.out.print("Not a Strong Number");
sc.close();
}
}