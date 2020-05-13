import java.io.*;
import java.util.*;
class CodeKataNumbers{
public static void main(String[] args)
{
int n,i,count=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<n;i++)
{
 if(i+(n-i)==n)
 { 
  count++;}
}


System.out.print(count);
}
}