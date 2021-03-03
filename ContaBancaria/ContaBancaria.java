
public class ContaBancaria {
String nome, cartao;
double saldo, debito;
ContaBancaria(String nome, double saldo, double debito){
	this.nome = nome;
	this.saldo = saldo;
	this.debito = debito;
	this.cartao = "Indisponivel.";
}
public void criarcartaoDebito() {
	if(this.cartao == "Indisponivel.") {
		this.cartao = "Debito";
	}else if(this.cartao == "Crédito") {
		this.cartao = "Debito/Crédito";
	}else {
		System.out.println("Desculpa, mas foi impossivel criar um cartão. Verfique se você já não possue um.");
	}
}
public void criarcartaoCredito() {
	if(debito==0) {
		if(this.cartao == "Indisponivel.") {
			this.cartao = "Crédito";
		}else if(this.cartao == "Debito") {
			this.cartao = "Debito/Crédito";
		}else {
			System.out.println("Desculpa, mas foi impossivel criar um cartão. Verfique se você já não possue um.");
		}
	}else {
		System.out.println("Pague seus debitos, e tente novamente.");
	}
}
public void pagarDebitos(double valor) {
	if(this.debito==0) {
		System.out.println("Você não possui debitos.");
	}else {
		if(valor<= this.debito) {
			this.debito -= valor;
			System.out.println("Seu debito atual é:"+debito);
		}else {
			valor-=this.debito;
			this.debito =0;
			System.out.println("Seu debito atual é:"+debito+". E seu troco de:"+valor);
		}
	}
}
public void depositarDinheiro(double valor) {
	saldo+=valor;
}
public void sacar(double valor) {
	if(this.saldo>=valor) {
		saldo-=valor;
		System.out.println("Seu saldo atual é:"+saldo);
	}else {
		valor-=saldo;
		saldo=0;
		debito-=valor;
		System.out.println("Seu saldo atual é:"+saldo+". E seu debito:"+debito);
	}
}
public void mostrarDados() {
	System.out.println("Cliente "+ nome+" tem "+saldo+" de saldo e "+debito+" de debito e cartão "+cartao);
}


}
