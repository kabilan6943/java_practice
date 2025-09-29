import java.util.*;
class Armstrong{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int tmp=num;
int abc=tmp;
int steps=0,rem=0,result=0,sum=0;
while(num>0){
    num/=10;
steps++; 
}
System.out.println(steps);
while(tmp>0){
 rem=tmp%10;
 result=(int)Math.pow(rem,steps);
sum+=result;
 tmp/=10;
}
if(sum==abc)System.out.print("Armstrong");
else System.out.print("Not a Armstrong");
sc.close();
}
}