
public class Eletronico {
int potencia;
String nome, voltagem;
Eletronico(String nome, int potencia, boolean cenDez, boolean DuzVin){
	this.nome = nome;
	this.potencia = potencia;
	if(cenDez == true && DuzVin == true) {
		voltagem = "bivolt";
	}else if(DuzVin == true) {
		voltagem = "220";
	}else {
		voltagem = "110";
	}
	
}

public void trocarvoltagem(String voltagem) {
	if(voltagem == "110"  || voltagem == "220"  || voltagem == "bivolt") {
		this.voltagem = voltagem;
	}else {
		System.out.println("Você inseriu uma voltagem incorreta. A voltagem do eletronico é "+this.voltagem);
	}
	

}
public void mudarpotencia(int potencia) {
	this.potencia = potencia;
}
public void testarvoltagem(String voltagem) {
	if(this.voltagem == "bivolt" || this.voltagem == voltagem  ) {
		System.out.println("A voltagem está correta. Pode conectar seu eletronico.");
	}else {
		System.out.println("A voltagem está incorreta. Não conecte seu eletronico.");
	}
}

public void mostrardados() {
	System.out.println("O eletronico "+ this.nome + " tem voltagem "+ voltagem+" e potencia "+potencia);
}
}
