class Box
{
    private int length, breadth, height;
    public void setdimension(int l, int b, int h)
    {length=l; breadth=b; height=h; }
    public void showdimension()
    {
        System.out.println("l="+length);
        System.out.println("b="+breadth);
        System.out.println("h="+height);
    }
}
public class check
{
    public static void main(String[] args)
    {
        Box smallBox=new Box();
        smallBox.setdimension(15 , 12 , 7);
        smallBox.showdimension();
    }
}