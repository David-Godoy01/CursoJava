package projetosemana4;

public class Veiculo {
	private boolean motor;
	private boolean volante;
	private int passageiros;
	private int portas;
	private int rodas;
	private boolean carga;
	private double capacidaDeCarga;
	private Combustivel comb;
	
	
	
	
	
	public Veiculo(boolean motor, boolean volante, int passageiros, int portas, int rodas, boolean carga,
			double capacidadeCarga, Combustivel comb) {
		super();
		this.motor = motor;
		this.volante = volante;
		this.passageiros = passageiros;
		this.portas = portas;
		this.rodas = rodas;
		this.carga = carga;
		this.capacidaDeCarga = capacidadeCarga;
		this.setComb(comb);
	}
	
	
	
	
	
	public boolean isMotor() {
		return motor;
	}
	public void setMotor(boolean motor) {
		this.motor = motor;
	}
	public boolean isVolante() {
		return volante;
	}
	public void setVolante(boolean volante) {
		this.volante = volante;
	}
	public int getPassageiros() {
		return passageiros;
	}
	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public int getRodas() {
		return rodas;
	}
	public void setRodas(int rodas) {
		this.rodas = rodas;
	}
	public boolean isCarga() {
		return carga;
	}
	public void setCarga(boolean carga) {
		this.carga = carga;
	}
	public double getCapacidadeCarga() {
		return capacidaDeCarga;
	}
	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidaDeCarga = capacidadeCarga;
	}
	public Combustivel getComb() {
		return comb;
	}
	public void setComb(Combustivel comb) {
		this.comb = comb;
	}
	
	
	// impressão de dados
	public String imprimir() {
		return "Possui motor? "+motor+"\nPossui Volante? "+volante+"\nQuantidade de passageiros: "+passageiros+"\nQuantidade de portas: "+portas+"\nÉ de carga?"+carga+"\nCapacidade de carga: "+capacidaDeCarga;
	}






	
	
	
}
