package Aula_4;

public class HelloWord {

	public static void main(String[] args) {
		int tam;
			
		tam = args.length;//qtd de argumentos
		if(tam > 0){
			for(int i = 0; i<tam; i++){
				System.out.println("O argumento, "+ i +" eh: "+ args[i]);
			}
		}else{
			System.out.println("Sem argumentos");
		}
	}
}
