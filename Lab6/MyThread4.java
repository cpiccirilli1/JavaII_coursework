/******************
Chelsea Piccirilli
Lab 6 #3
******************/


public class MyThread4 extends Thread{
	private int threadNum;

	public void MyThread4(int number){
		this.threadNum = number;	
	}
	
	public void run(){
		
		int tNum = this.threadNum;
		System.out.println("Thread running.... " + tNum);
	}
	
	public static void main(String[] args){
	

		MyThread4 mt1;
		mt1 = new MyThread4();
		mt1.MyThread4(0);
		mt1.start();

		MyThread4 mt2;
		mt2 = new MyThread4();
		mt2.MyThread4(1);
		mt2.start();

		MyThread4 mt3;
		mt3 = new MyThread4();
		mt3.MyThread4(2);
		mt3.start();

		MyThread4 mt4;
		mt4 = new MyThread4();
		mt4.MyThread4(3);
		mt4.start();
	}

}