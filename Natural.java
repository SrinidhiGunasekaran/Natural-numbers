import java.util.*;
class Natural
{
public static void main(String args[])
{
int i,sum=0;
Scanner sc=new Scanner(System.in);
i=sc.nextInt();
if(i==0)
{
System.out.println("Invalid data");
}
while(i!=0)
{
sum+=i;
i--;
}
System.out.println(sum);
}
}
