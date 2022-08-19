package drill;

class Name {
	void Ref() {
		System.out.println("Name : Stephen Strange");
	}
}

class Age extends Name {
	void Ref() {
		System.out.println("Age : 32");
	}
}

class SuperName extends Name {
	void Ref() {
		System.out.println("Superhero Name : Doctor Strange");
	}
}

class Works extends Name {
	void Ref() {
		System.out.println("Works for : S.H.I.E.L.D");
	}
}

public class Poly {
	public static void main(String args[]) {
		Name s;

		s = new SuperName();
		s.Ref();
		s = new Age();
		s.Ref();
		s = new Works();
		s.Ref();
	}

}
