/**
 * @author agatha-paiva
 */

package br.com.utfpr.java.dto;

import br.com.utfpr.java.implement.Calc;

public final class Carga extends Veiculo implements Calc{
	private int tara;
	private int cargaMax;
	
	public Carga() {
		this.tara = 0;
		this.cargaMax = 0;
	}
	
	public Carga(int tara, int cargaMax ) {
		this.tara = tara;
		this.cargaMax = cargaMax;
	}
	
	/**
	 * @return the tara
	 */
	public int getTara() {
		return tara;
	}

	/**
	 * @param tara the tara to set
	 */
	final public void setTara(int tara) {
		this.tara = tara;
	}

	/**
	 * @return the cargaMax
	 */
	public int getCargaMax() {
		return cargaMax;
	}

	/**
	 * @param cargaMax the cargaMax to set
	 */
	final public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	@Override
	public float calcVel(float velocMax) {
		float result = (float) (velocMax * 100000);
		return result;
	}

	@Override
	public int calcular() {
		int somaNum = 0;
		somaNum += getMotor().getQtdPist();
		somaNum += getMotor().getPotencia();
		somaNum += getQtdRodas();
		somaNum += getVelocMax();
		somaNum += getTara();
		somaNum += getCargaMax();
		return somaNum;
	}
	
	@Override
	public String toString() {
		return "A placa do veículo é: " + super.getPlaca() + "\n" +
				"A marca do veículo é: " + super.getMarca() + "\n" +
				"O modelo do veículo é: " + super.getModelo() + "\n" +
				"A cor do veículo é: " + super.getCor() + "\n" +
				"A quantidade de rodas do veículo são: " + super.getQtdRodas() + "\n" +
				super.getMotor() + 
				"A tara do veículo é: " + tara + "\n" +
				"A carga máxima do veículo é: " + cargaMax + "\n" +
				"A velocMax do veículo é: " + calcVel(super.getVelocMax()) + " cm/h";
		
	}
	
}
