package projetosemana4;

public class Caminhao extends Veiculo {
	private int Eixos;

	
	public Caminhao(boolean motor, boolean volante, int passageiros, int portas, int rodas, boolean carga,
			double capacidadeCarga, Combustivel comb, int eixos) {
		super(motor, volante, passageiros, portas, rodas, carga, capacidadeCarga, comb);
		Eixos = eixos;
	}

	public int getEixos() {
		return Eixos;
	}

	public void setEixos(int eixos) {
		Eixos = eixos;
	}
	
	public String imprimir() {
		return "Categoria Caminhao selecionada: "+"\nPossui motor? "+this.isMotor()+"\nPossui Volante? "+this.isVolante()+"\nQuantidade de passageiros: "+this.getPassageiros()+"\nQuantidade de portas: "+this.getPortas()+"\nQuantidade de rodas: "+this.getRodas()+"\nÉ de carga?"+this.isCarga()+"\nCapacidade de carga"+this.getCapacidadeCarga()+"\nQuantidade de Eixos? "+Eixos;
	}
	
	

}
