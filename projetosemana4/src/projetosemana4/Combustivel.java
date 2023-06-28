package projetosemana4;

public class Combustivel {
	//atributos
	private boolean gasolina;
	private boolean alcool;
	private boolean diesil;
	private boolean eletricidade;
	private boolean humano;
	private boolean animal;

	
	public Combustivel(boolean gasolina, boolean alcool, boolean diesil, boolean eletricidade, boolean humano,
			boolean animal) {
		super();
		this.gasolina = gasolina;
		this.alcool = alcool;
		this.diesil = diesil;
		this.eletricidade = eletricidade;
		this.humano = humano;
		this.animal = animal;
	}
	//metodo de acesso
	public boolean isGasolina() {
		
		return gasolina;
	}
	public void setGasolina(boolean gasolina) {
		this.gasolina = gasolina;
	}
	public boolean isAlcool() {
		return alcool;
	}
	public void setAlcool(boolean alcool) {
		this.alcool = alcool;
	}
	public boolean isDiesil() {
		return diesil;
	}
	public void setDiesil(boolean diesil) {
		this.diesil = diesil;
	}
	public boolean isEletricidade() {
		return eletricidade;
	}
	public void setEletricidade(boolean eletricidade) {
		this.eletricidade = eletricidade;
	}
	public boolean isHumano() {
		return humano;
	}
	public void setHumano(boolean humano) {
		this.humano = humano;
	}
	public boolean isAnimal() {
		return animal;
	}
	public void setAnimal(boolean animal) {
		this.animal = animal;
	}
	
	public void imprimirComb(){
		System.out.println("");
	}
	public String toString() {
		return "Combustivel [gasolina=" + gasolina + ", alcool=" + alcool + ", diesil=" + diesil + ", eletricidade="
				+ eletricidade + ", humano=" + humano + ", animal=" + animal + "]";
	}
	

	
	
	
	
	

}
