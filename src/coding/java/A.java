package coding.java;

/* Recursive constructor invocation. This class will not compile.*/
class A {
	A(){
		this("foo");
	}
	A(String s){
		this();
	}
}