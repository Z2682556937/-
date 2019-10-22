
public class Three {

	public static void main(String[] args) {
		TeacherWindow tw=new TeacherWindow();
		new Thread(tw,"老师1").start();
		new Thread(tw,"老师2").start();
		new Thread(tw,"老师3").start();

	}

}
class TeacherWindow implements Runnable{
	private int notebooks=80;
	public void run(){
		while(true){
			if(notebooks>0){
				Thread th=Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th_name+"正在批改第"+notebooks--+"本作业");
			}
		}
	}
}