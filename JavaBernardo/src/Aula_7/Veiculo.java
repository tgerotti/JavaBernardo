package Aula_7;

public abstract class Veiculo {
	
	String placa;
	static int conatador = 0;
	
	public abstract String descricao();
	//apresenta descricao do veiculo
	public abstract String detalhes();
	//km do carro e qtd de donos
	
	public Veiculo(String placa) {
		this.placa = placa;
	}
	public Veiculo() {
		this.placa = "";
		
	}

}
