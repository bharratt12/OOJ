import java.util.Scanner;
import java.lang.Math;
abstract class Calculate
{
Calculate(){}
double x,y,result;
abstract void calc();
}
class add extends Calculate
{
Scanner s=new Scanner(System.in);
void calc()
{
System.out.println("Enter values for x and y");
x=s.nextDouble();
y=s.nextDouble();
result=x+y;
System.out.println("Sum= "+result);
}
add(){}
}


class sub extends Calculate
{
Scanner s=new Scanner(System.in);
void calc()
{
System.out.println("Enter values for x and y");
x=s.nextDouble();
y=s.nextDouble();
result=x-y;
System.out.println("difference= "+result);
}
sub(){}
}

class mult extends Calculate
{
Scanner s=new Scanner(System.in);
void calc()
{
System.out.println("Enter values for x and y");
x=s.nextDouble();
y=s.nextDouble();
result=x*y;
System.out.println("product="+result);
}
mult(){}
}


class Lab6
{
public static void main(String xx[])
{
add a =new add();
a.calc();
sub b =new sub();
b.calc();
mult c =new mult();
c.calc();

}
}