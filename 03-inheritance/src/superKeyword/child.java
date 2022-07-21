package superKeyword;

public class child extends parent {
int c, d;
	
	child() {
		
	}
	
	child (int x, int y) {
		super(-1, -1);
		this.c = x;
		this.d = y;
	}
	
	child (int a, int b, int c, int d) {
		super(a, b);
		this.c = c;
		this.d = d;
	}
	
	void displayDetails() {
		System.out.println("Parent a = " + a);
		System.out.println("Parent b = " + b);
		System.out.println("Child  c = " + c);
		System.out.println("Child  d = " + d);
}}
