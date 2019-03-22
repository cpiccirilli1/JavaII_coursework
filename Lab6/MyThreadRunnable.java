/******************
Chelsea Piccirilli
Lab 6 #2
******************/

public class MyThreadRunnable implements Runnable{
	int numberThr;
	
	public void MyThreadRunnable(int number){
		this.numberThr = number;	
	}
	
	public void run(){
		int tNum = this.numberThr;
		System.out.println("Thread running.... " + tNum);
	}
	
	public static void main(String[] args){
	
		MyThreadRunnable t1;
		t1 = new MyThreadRunnable();
		t1.MyThreadRunnable(200);

		Thread mt1;
		mt1 = new Thread(t1);
		mt1.start();
	
	}

}