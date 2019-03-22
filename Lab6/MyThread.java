/******************
Chelsea Piccirilli
Lab 6 #1
******************/


public class MyThread extends Thread{
	private int threadNum;

	public void MyThread(int number){
		this.threadNum = number;	
	}
	
	public void run(){
		
		int tNum = this.threadNum;
		System.out.println("Thread running.... " + tNum);
	}
	
	public static void main(String[] args){
	
		MyThread mt1;
		mt1 = new MyThread();
		mt1.MyThread(200);
		mt1.start();
	
	}

}