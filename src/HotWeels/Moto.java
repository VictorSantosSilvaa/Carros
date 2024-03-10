package HotWeels;

public class Moto extends Veiculo {
	boolean possuiPartidaEletrica;

	public boolean isPossuiPartidaEletrica() {
		return possuiPartidaEletrica;
	}

	public void setPossuiPartidaEletrica(String respostaUsuario) {
		if ("sim".equalsIgnoreCase(respostaUsuario)) {
			this.possuiPartidaEletrica = true;
		} else if ("não".equalsIgnoreCase(respostaUsuario)) {
			this.possuiPartidaEletrica = false;
		}else {
			System.err.println("Tente novamente.");
		}

	}
}
