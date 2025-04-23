package ch.e_A_Closer_Look_At_Method_And_Classes;

public class CallByRef {

	int a, b;
	CallByRef(int i, int j) {
		a=i;
		b=j;
	}

	void meth(CallByRef ob) {
		ob.a*=2;
		ob.b/=2;
	}
}
