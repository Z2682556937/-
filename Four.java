
public class Four {

	public static void main(String[] args) {
		TaxiWindow tw=new TaxiWindow();
		new Thread(tw,"���⳵1").start();
		new Thread(tw,"���⳵2").start();
		new Thread(tw,"���⳵3").start();
		new Thread(tw,"���⳵4").start();
		new Thread(tw,"���⳵5").start();


	}

}
class TaxiWindow implements Runnable{
	private int passengers=100;
	public void run(){
		while(true){
			if(passengers>0){
				Thread th=Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th_name+"���ڽ��͵�"+passengers--+"���˿�");
			}
		}
	}
}