package Aula_4;

public class UsarTres {

	public static void main(String[] args) {
		int n;
		System.out.print("Ola ");
		
		if (args.length > 0) {
			
			for (n = args.length - 1; n >= 0; n--) {
				System.out.print(args[n]);
				// para exibir and antes do ultimo e , depois de cada nome
				if (n == 1) {
					System.out.print(" and ");
				} else {
					if (n == 0) {
						System.out.print("!\n");
					} else {
						System.out.print(", ");
					}
				}
			}
		} else {
			System.out.println("sem argumentos");
		}
	}

}
