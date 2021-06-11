package java_testes;

public class Calculadora {
	public int somar(int n1, int n2) {
		return n1 + n2;
	}
	
	public int subtrair(int n1, int n2) {
		return n1 - n2;
	}
	
	public int multiplicar(int n1, int n2) {
		return n1 * n2;
	}
	
	public int dividir(int n1, int n2) {
		return n1 / n2;
	}
	
	public int potencia(int n1, int n2) {
	int res = 1;
	
	for (int i = 0; i < n2; i++) {
		res = res * n1;
		}
		return res;
	}
	
}
