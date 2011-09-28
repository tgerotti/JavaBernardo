package Trabalho_Aula_9;

public interface DAO<X> {

	public int incluir(X objeto);
	
	public int alterar(X objeto);
	
	public int excluir(X objeto);
	
	
}