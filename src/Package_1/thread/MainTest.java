package Package_1.thread;
class ThreadC extends Thread{

	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("ThreadC : " + i);
		}
	}
}
class ThreadA extends Thread{

	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("ThreadA : " + i);
		}
	}
}
class ThreadB extends ArrayStoreException implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("ThreadB : " + i);
		}
	}
}
public class MainTest {

	public static void main(String[] args) {
		ThreadA ta = new ThreadA();
		Thread tc = new Thread(new ThreadB());
		Thread tt = new Thread(new ThreadC());
		ta.start();							//새로운 스레드로 시작해라는 것 (상속받은것의 메소드임)
		tc.start();
		tt.start();
	}
}
