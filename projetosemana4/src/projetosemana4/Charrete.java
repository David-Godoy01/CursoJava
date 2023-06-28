package projetosemana4;

public class Charrete extends Veiculo {

	public Charrete(boolean motor, boolean volante, int passageiros, int portas, int rodas, boolean carga,
			double capacidadeCarga, Combustivel comb) {
		super(motor, volante, passageiros, portas, rodas, carga, capacidadeCarga, comb);
		
	}
public String imprimir() {
		
		return "Categoria Charrete selecionada: "+"\nPossui motor? "+this.isMotor()+"\nPossui Volante? "+this.isVolante()+"\nQuantidade de passageiros: "+this.getPassageiros()+"\nQuantidade de portas: "+this.getPortas()+"\nQuantidade de rodas: "+this.getRodas()+"\nÉ de carga?"+this.isCarga()+"\n"+this.getComb();
	}
	

}
