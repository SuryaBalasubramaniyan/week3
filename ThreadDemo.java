import java.lang.*;

class A extends Thread{
	public void run(){
		for(int i=1;i<=10;i++)
		{
			System.out.println("i :"+i);
			try{
				Thread.sleep(300);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}


}

class B extends Thread{
	public void run(){
		for(int i=1;i<=10;i++)
		{
			System.out.println("j :"+i);
			try{
				Thread.sleep(200);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}


}

class C extends Thread{
	public void run(){
		for(int i=1;i<=10;i++)
		{
			System.out.println("k :"+i);
			try{
				Thread.sleep(100);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}


}

public class ThreadDemo{
	public static void main(String[] args){
		A a1=new A();
		B b1=new B();
		C c1=new C();

		a1.start();
		b1.start();
		c1.start();

		a1.setName("surya");
		b1.setPriority(8);

		Thread m1=Thread.currentThread();
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		System.out.println(m1);

		for(int i=0;i<=50;i++){
			System.out.println(i);
			Thread.sleep(200);
		}

	System.out.println("Main exit");
	}
}