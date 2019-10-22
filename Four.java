
public class Four {

	public static void main(String[] args) {
		TaxiWindow tw=new TaxiWindow();
		new Thread(tw,"出租车1").start();
		new Thread(tw,"出租车2").start();
		new Thread(tw,"出租车3").start();
		new Thread(tw,"出租车4").start();
		new Thread(tw,"出租车5").start();


	}

}
class TaxiWindow implements Runnable{
	private int passengers=100;
	public void run(){
		while(true){
			if(passengers>0){
				Thread th=Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th_name+"正在接送第"+passengers--+"个乘客");
			}
		}
	}
}