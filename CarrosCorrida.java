
public class CarrosCorrida {

	final static int NUM_CARROS = 2;	// QTE. de carros na corrida
	final static int DISTANCIA = 1000; // Dist�ncia da corrida em metros
	public static void main (String[] args) {
		/* colocando carros na corrida */
		for (int i = 1; i <= NUM_CARROS; i++) {
			new CarroCorridaThread("Carro" + i, DISTANCIA).start();
		}
	}

}
