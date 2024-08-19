package view;

import controller.ControllerFib;

public class Principal {
	public static void main(String[] args) {
		ControllerFib controller = new ControllerFib();
		int fib = 2;
		int[] vet = new int[fib];
		int result = controller.fibonacci(fib, 0, vet);
		System.out.println(result);
	}
}
