
    import java.util.*;
class Spy{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int digits=sc.nextInt();
int sum=0;
int pro=1;
int temp=digits;
int temp1=digits;
while(digits>0){
int rem=digits%10;
sum=sum+rem;
digits=digits/10;
}
while(temp>0){
int rem1=temp%10;
pro=pro*rem1;
temp=temp/10;
}
if(sum==pro)System.out.printf("%d is a Spy Number",temp1);
else System.out.printf(" %d is not a Spy Number",temp1);
sc.close();
}
}

