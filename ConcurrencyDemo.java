import java.lang.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

class Abc implements Runnable{
ReentrantLock r1=new ReentrantLock();
  public void run(){
	try{
	if(r1.tryLock(15,TimeUnit.SECONDS)){
	for(int i=1;i<=20;i++)
		{
			System.out.println(Thread.currentThread().getName()+" :"+i);
			Thread.sleep(500);
		}
			
	r1.unlock();
	}
	else{
		System.out.println(Thread.currentThread().getName()+"Thread can't wait");
	}
	}
	catch(Exception e){
				System.out.println(e);
			}
  }

}

public class ConcurrencyDemo{
	public static void main(String[] args){
		Abc a=new Abc();
		Thread m=new Thread(a);
		Thread m1=new Thread(a);
		Thread m2=new Thread(a);
		m.setName("a");
		m1.setName("b");
		m2.setName("c");
		m.start();
		m1.start();
m2.start();


	}

}