package projetosemana4;

public class Transporte {

	public static void main(String[] args) {
		
		Veiculo v1 = new Carro(true, true, 3, 2, 5, false, 0, null);
		
		
		Combustivel c1= new Combustivel(true, false, false, false, false, false);
		
		
		System.out.println(v1.imprimir()+"\nCombustivel: "+c1);
		
	}

}
