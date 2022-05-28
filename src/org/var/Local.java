package org.var;

public class Local {
	private int a;
	private void sample() {
		a=100;
		System.out.println("a in method:"+a);

	}
	public static void main(String[] args) {
		Local l = new Local();
		System.out.println("before method calling:"+l.a);
		l.sample();
		System.out.println("after method calling:"+l.a);
	}

}
