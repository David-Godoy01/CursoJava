package projetosemana4;

public class Bicicleta extends Veiculo{
	private boolean Eletrica;
	private boolean bagageiro;
	
	
	
	public Bicicleta(boolean motor, boolean volante, int passageiros, int portas, int rodas, boolean carga,
			double capacidadeCarga, Combustivel comb, boolean eletrica, boolean bagageiro) {
		super(motor, volante, passageiros, portas, rodas, carga, capacidadeCarga, comb);
		Eletrica = eletrica;
		this.bagageiro = bagageiro;
	}
	public boolean isEletrica() {
		return Eletrica;
	}
	public void setEletrica(boolean eletrica) {
		Eletrica = eletrica;
	}
	public boolean isBagageiro() {
		return bagageiro;
	}
	public void setBagageiro(boolean bagageiro) {
		this.bagageiro = bagageiro;
	}
	public String imprimir() {
		return "Categoria Bicicleta selecionada: "+"\nPossui motor? "+this.isMotor()+"\nPossui Volante? "+this.isVolante()+"\nQuantidade de passageiros: "+this.getPassageiros()+"\nQuantidade de portas: "+this.getPortas()+"\nQuantidade de rodas"+this.getRodas()+"\nÉ de carga?"+this.isCarga()+"\nÉ eletrica? "+Eletrica+"\nTem Bagageiro? "+bagageiro;
	}
	
}
