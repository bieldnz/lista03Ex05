package controller;

public class ControllerFib {
	
	public ControllerFib() {
		super();
	}
	
	public int fibonacci(int fib, int cont, int[] vet) {
		if(cont < fib) { //A condição de parada será quando o contador igualar o fib
			if(cont == 0 || cont == 1) {
				vet[cont] = 1;
				//System.out.println(cont);
			}else {
				vet[cont] = vet[cont - 1] + vet[cont - 2];
			}
			fib = fibonacci(fib, cont + 1, vet);// Essa será a função em relação ao termo anterior
			return fib;	
		}else {
			return vet[cont-1];
		}
	}
	
}
