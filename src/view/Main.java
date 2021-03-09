package view;

import controller.Threads;

public class Main {
	public static void main(String[] args) {
		for (int IdThread = 0; IdThread < 5; IdThread++) {
			Threads threads = new Threads(IdThread);
			threads.start();
			
		}
	}
}
