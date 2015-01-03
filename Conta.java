package br.com.empresa.banco.conta;
public abstract class Conta {
	protected double saldo;
	protected String titular;

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	/**
	 * Deposita valor
	 * @param valor - é o que deseja depositar
	 * @throws ValorInvalidoException - Quando valor vier negativo ou zero
	 */
	public void deposita(double valor) throws ValorInvalidoException {
		if (valor <= 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor;
		}	
	}

	/**
	 * Deposita valor
	 * @param valor - é o que deseja sacar
	 * 

	 */
	public void saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		}
	}

	public abstract void atualiza(double taxa);

}
