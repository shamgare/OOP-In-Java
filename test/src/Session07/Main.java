package Session07;

public class Main {
    public static void main(String[] args) {
    	System.out.println("");
    	IInterface i = new Coba();
    	i.method1();
    }
}

/*
 *  class vs abstract class vs interface
 *  
 *  abstract class -> 
 *  sebuah class yg memiliki method yg belum didefinisikan
 *  variable bisa constant/tidak
 *  cuma bisa di extend 1 kali (turunannya cuma boleh punya 1 parent)
 *  
 *  interface      -> 
 *  semua methodnya abstract
 *  semua variable constant
 *  implement (boleh lebih dari 1)
 */

interface IInterface
{
	int konstanta1 = 1;
	void method1(); // pasti abstract
}
interface IInterface2
{
	void method2(); // pasti abstract
}

class Parent {
	int a;
}
class Coba extends Parent implements IInterface, IInterface2 {

	@Override
	public void method1() {
//		 TODO Auto-generated method stub
		
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
}
