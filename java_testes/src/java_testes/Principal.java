package java_testes;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		String txt1 = JOptionPane.showInputDialog("Digite o primeiro numero");
		int numero1 = Integer.parseInt(txt1);
		
		String sinal = JOptionPane.showInputDialog("Digite a operação");
		
		String txt2 = JOptionPane.showInputDialog("Digite o segundo numero");
		int numero2 = Integer.parseInt(txt2);
		
		
		
		if (sinal.equals("+")) {
			int resultado = calc.somar(numero1, numero2);
			JOptionPane.showMessageDialog(null, "o resultado é " + resultado);
		}
		
		else if(sinal.equals("-")) {
			int resultado = calc.subtrair(numero1, numero2);
			JOptionPane.showMessageDialog(null, "o resultado é " + resultado);
		}
		
		else if(sinal.equals("*")) {
			int resultado = calc.multiplicar(numero1, numero2);
			JOptionPane.showMessageDialog(null, "o resultado é " + resultado);
		}
		
		else if(sinal.equals("/")){
			int resultado = calc.dividir(numero1, numero2);
			JOptionPane.showMessageDialog(null, "o resultado é " + resultado);
		}
		
		else if(sinal.equals("elevado")){
			double resultado = calc.potencia(numero1, numero2);
			JOptionPane.showMessageDialog(null, "o resultado é " + resultado);
			
		}
		
	}

}
