package HotWeels;

public class Moto extends Veiculo{
	boolean possuiPartidaEletrica;

	public boolean isPossuiPartidaEletrica() {
		return possuiPartidaEletrica;
	}

	public void setPossuiPartidaEletrica(boolean possuiPartidaEletrica) {
		this.possuiPartidaEletrica = possuiPartidaEletrica;
	}
	
	@Override
	public void moto() {
		System.out.println("Possui partida elétrica: " + isPossuiPartidaEletrica());
	}
}
