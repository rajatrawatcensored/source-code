import java.util.Scanner;
class InputExample
{
public static void main(String[] args)
{
System.out.println("Enter Name and Age");
Scanner sc=new Scanner(System.in);
String name = sc.nextLine();
int age = sc.nextInt();
System.out.println("Name :" +name);
System.out.println("Age: " +age);
}
}

