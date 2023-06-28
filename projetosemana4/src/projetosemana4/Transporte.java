package projetosemana4;

public class Transporte {

	public static void main(String[] args) {
		
		Caminhao v1 = new Caminhao(true, true, 3, 2, 12, true, 24000, null, 4);
		
		
		Combustivel c1= new Combustivel(false, false, true, false, false, false);
		v1.setComb(c1);
		
		System.out.println(v1.imprimir());
		
	}

}
