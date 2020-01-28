class Box{
private int length;
private int width; 
private int height;
public void setDimension(int l, int w, int h)
{
	length=l;
	width=w;
	height=h;
}
public void showDimension(){
System.out.println("Length:"+length);
System.out.println("Width:"+width);
System.out.println("Height:"+height);
}
}
class Dimension
{
public static void main(String args[])
{
Box b=new Box();
b.setDimension(15,10,5);
b.showDimension();
}
}