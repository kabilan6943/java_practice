import java.util.*;
class ArrayPrintReverse{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the Array");
int s=sc.nextInt();
int a[]=new int[s];
for(int i=0;i<s;i++)
a[i]=sc.nextInt();
int i=0;
int j=a.length-1;
while(i<j){
int t=a[i];
a[i]=a[j];
a[j]=t;
i++;
j--; 
}
System.out.print(Arrays.toString(a));
sc.close();
}
}