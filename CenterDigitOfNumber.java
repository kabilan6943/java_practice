import java.util.*;
class CenterDigitOfNumber{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String s=Integer.toString(n);
int d=s.length();
if(d%2==0){
System.out.print("-1");
}else{
char e=s.charAt(s.length()/2);
System.out.print(e);
}
sc.close();
}
}