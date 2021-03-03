
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eletronico eletro1 = new Eletronico ("Celular",900, false, true);
		eletro1.mostrardados();
		eletro1.testarvoltagem("110");
		eletro1.trocarvoltagem("bivolt");
		eletro1.testarvoltagem("110");
		eletro1.trocarvoltagem("320");
		eletro1.mostrardados();

	}

}
