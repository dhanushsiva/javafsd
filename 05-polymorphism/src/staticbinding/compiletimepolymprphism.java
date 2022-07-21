package staticbinding;

public class compiletimepolymprphism {

	public static void main(String[] args) {
		compiletimepolymprphism obj =new compiletimepolymprphism ();
		obj.add(2, 4);;
		obj.add(2, 3,4);
		obj.add(3f,4.5f);
	}
	
	//method overloading
	void add(int a, int b)
	{
		int res=a+b;
		System.out.println(res);
	}
	void add(float a, float b)
	{
		float res=a+b;
		System.out.println(res);
	}
	
	void add(int a, int b, int c)
	{
		int res=a+b+c;
		System.out.println(res);
	}
}
