package projetosemana4;

public class Moto extends Veiculo {
	
	private boolean partidaEletrica;
	
	public Moto(boolean motor, boolean volante, int passageiros, int portas, int rodas, boolean carga,
			double capacidadeCarga, Combustivel comb, boolean partidaEletrica) {
		super(motor, volante, passageiros, portas, rodas, carga, capacidadeCarga, comb);
		this.partidaEletrica = partidaEletrica;
	}

	public boolean isPartidaEletrica() {
		return partidaEletrica;
	}

	public void setPartidaEletrica(boolean partidaEletrica) {
		this.partidaEletrica = partidaEletrica;
	}
	public String imprimir() {
		return "Categoria Moto selecionada: "+"\nPossui motor? "+this.isMotor()+"\nPossui Volante? "+this.isVolante()+"\nQuantidade de passageiros: "+this.getPassageiros()+"\nQuantidade de portas: "+this.getPortas()+"\nQuantidade de rodas"+this.getRodas()+"\nÉ de carga?"+this.isCarga()+"\nTem partida Eletrica? "+partidaEletrica+"\n"+this.getComb();
	}

	
		
	}


