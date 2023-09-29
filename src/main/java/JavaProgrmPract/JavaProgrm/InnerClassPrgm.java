package JavaProgrmPract.JavaProgrm;

public class InnerClassPrgm 
{
	int a=10;
	
	static class ScndClass
	{
		int b=20;
	}
	
	public class ThirdClass
	{
		int c=30;
		public int value() {
			return a;
		}
	}
	
    public static void main( String[] args )
    {
        InnerClassPrgm obj = new InnerClassPrgm();
        InnerClassPrgm.ScndClass obj1 = new InnerClassPrgm.ScndClass();
        InnerClassPrgm.ThirdClass obj2 = obj.new ThirdClass();
        System.out.println(obj.a);
        System.out.println(obj1.b);
        System.out.println(obj2.c);
        System.out.println(obj2.value());
          
    }
}
