package projetosemana4;

public class Carro extends Veiculo{
	
	private boolean arCondicionado;
	private boolean radio;
	
	public Carro(boolean motor, boolean volante, int passageiros, int portas, int rodas, boolean carga,
			double capacidadeCarga, Combustivel comb) {
		super(motor, volante, passageiros, portas, rodas, carga, capacidadeCarga, comb);
		
	}
	
	
	
	
	
	
	public boolean isArCondicionado() {
		return arCondicionado;
	}
	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	public boolean isRadio() {
		return radio;
	}
	public void setRadio(boolean radio) {
		this.radio = radio;
	}
	
	
	public String imprimir() {
		
		return "Categoria Carro selecionada: "+"\nPossui motor? "+this.isMotor()+"\nPossui Volante? "+this.isVolante()+"\nQuantidade de passageiros: "+this.getPassageiros()+"\nQuantidade de portas: "+this.getPortas()+"\nQuantidade de rodas: "+this.getRodas()+"\nÉ de carga?"+this.isCarga()+"\nPossui Ar Condicionado? "+arCondicionado+"\nPossui Radio? "+radio+"\n"+this.getComb();
	}

}
