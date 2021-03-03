
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBancaria zero = new ContaBancaria("Ana",150.56,78.6);
		zero.mostrarDados();
		zero.pagarDebitos(50);
		zero.mostrarDados();
		zero.criarcartaoCredito();
		zero.mostrarDados();
		zero.pagarDebitos(30);
		zero.mostrarDados();
		zero.criarcartaoCredito();
		zero.mostrarDados();
		ContaBancaria um = new ContaBancaria("Joaquim",15000,0);
		um.mostrarDados();
		um.criarcartaoDebito();
		um.mostrarDados();
		um.criarcartaoDebito();
		um.criarcartaoCredito();
		um.mostrarDados();
		um.sacar(2560544.78);
		um.mostrarDados();
		

	}

}
