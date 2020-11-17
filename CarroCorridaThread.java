
public class CarroCorridaThread extends Thread {

	String nome;					// nome do carro
	int distanciaCorrida = 0;		// dist�ncia j� corrida pelo carro
	int distanciaTotalCorrida;	// dist�ncia a ser corrida pelo carro
	int andar = 0;					// distancia do carro em m
	int percorrido = 0;					// quantidades de metros corridos na corrida
	static int colocacao = 0;		// coloca��o do carro ao final da corrida
	final static int MAXIMO_PERCORRER = 50; // dist�ncia m�xima em metros que um carro pode correr

	/** Construtor da classe. Par�mtros : Nome do Carro e Dist�ncia da Corrida */
	public CarroCorridaThread (String nome, int distanciaTotalCorrida) {
		/* chamando o construtor de Thread passando o nome do carro como par�metro */
		super(nome);
		this.distanciaTotalCorrida = distanciaTotalCorrida;
		this.nome = nome;
	}
	/** Imprime o �ltimo andar do carro e a dist�ncia percorrida */
	public void carroImprimindoSituacao () {
		System.out.println("O " + nome +  " andou " + andar + "m \t e j� percorreu " +
							distanciaCorrida + "m" + " faltam "+(distanciaTotalCorrida - distanciaCorrida)+"m a serem percorridos! " );
	}
	/** Faz o carro andar */
	public void carroAnda() {
		percorrido++;
		andar = (int) (Math.random() * MAXIMO_PERCORRER);
		distanciaCorrida += andar;
		if (distanciaCorrida > distanciaTotalCorrida) {
			distanciaCorrida = distanciaTotalCorrida;
		}
	}
	/** Imprime a coloca��o do carro ao final da corrida */
	public void colocacaoCarro () {
		colocacao++;
		System.out.println(nome + " foi o " + colocacao + 
							"� colocado com " + percorrido + " movimenta��es");
	}
	/** M�todo run da thread Corrida de Carros */
	public void run () {
		while (distanciaCorrida < distanciaTotalCorrida) {
			carroAnda();
			carroImprimindoSituacao();
			
		}
		colocacaoCarro();
	}

}
