package controller;

public class Threads extends Thread {
	
	private int IdThread;
	
	public Threads (int IdThread) {
		this.IdThread = IdThread;
	}
	
	@Override
	public void run() {
		IdThread();
	}
	
	public void IdThread() {
		System.out.println("O ID da Thread é: "+ IdThread);
	}
}