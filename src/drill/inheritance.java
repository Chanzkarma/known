package drill;

class A {
	void name() {
		System.out.println("Name: Peter Parker ");
	}
}

class B extends A {
	void age() {
		System.out.println("Age : 27");
	}
}

class Class extends B {
	void Role() {
		System.out.println("Role: Super Hero");
	}
}

public class inheritance {

	public static void main(String args[]) {
		Class in = new Class();
		in.name();
		in.age();
		in.Role();

	}

}
