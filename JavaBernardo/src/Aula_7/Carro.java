package Aula_7;

public class Carro extends Veiculo {
	int ano;
	String marca, modelo;
	float motor;
	Pessoa proprietario;
	
	public Carro(String placa, int ano, String marca, String modelo,
			float motor, String nome, String rg, String cpf, String telefone) {
		super(placa);
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
		this.proprietario = new Pessoa(nome, rg, cpf, telefone);
		Carro.conatador ++;
	}
	
	public Carro(String placa, int ano, String marca, String modelo,
			float motor, Pessoa proprietario) {
		super(placa);
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
		this.proprietario = proprietario;
		Carro.conatador ++;
	}
	public Carro() {
		super();
		this.ano = 0;
		this.marca = "";
		this.modelo = "";
		this.motor = 0.0f;
		this.proprietario = new Pessoa();
		Carro.conatador ++;
	}

	@Override
	public String descricao() {
		// apresenta descricao do veiculo
		return "Veiculo: " + marca + " - "+ modelo
				+ "\nMotor "+ motor + " ano - " + ano +".";
	}

	@Override
	public String detalhes() {
		//km do carro e qtd de donos
		return 	"Total de proprietarios n/a, kilometragem: n/a";
	}

	@Override
	public String toString() {
		
		return proprietario + descricao() + "\n" + detalhes();
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getMotor() {
		return motor;
	}

	public void setMotor(float motor) {
		this.motor = motor;
	}

	public Pessoa getProprietario() {
		return proprietario;
	}

	public void setProprietario(Pessoa proprietario) {
		this.proprietario = new Pessoa();
	}


}
