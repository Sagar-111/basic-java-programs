package ch.e_A_Closer_Look_At_Method_And_Classes;

public class ObjectRet {

	int a;
	ObjectRet(int i){
		a=i;
	}

//	Here return Type is class/ We can say Return type is an object of a class.
	ObjectRet incrementByTen() {
		ObjectRet object = new ObjectRet(a+10);
		return object;

	}

}
