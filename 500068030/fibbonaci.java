class Fibonacci
{
int a=0;
int b=1;
int c=0;
int n=50;
public void fib()
{
System.out.println(a);
System.out.println(b);
for(int i=1;c<n;i++)
{
c=a+b;
a=b;
b=c;
if(c<n)
System.out.println(c);
}
}
}
class fibbonaci
{
public static void main(String args[])
{
Fibonacci obj = new Fibonacci();	
obj.fib();
}
}