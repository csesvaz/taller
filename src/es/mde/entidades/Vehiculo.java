package es.mde.entidades;

import com.kzurro.electrodomesticos.Financiable;

public class Vehiculo implements Financiable{

	private String modelo;
	private String color;

	protected String getModelo() {
		return modelo;
	}

	public String getColor() {
		return color;
	}

	protected void setColor(String color) {
		this.color = color;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Vehiculo() {
		this("", "");
	}

	public Vehiculo(String modelo, String color) {
		setModelo(modelo);
		setColor(color);
	}

	@Override
	public String toString() {
		return getModelo() +  " " + getColor() + " ";
	}

	public double getCuantiaCuota() {

		return 0;
	}

	@Override
	public float getPrecioFactura() {
	
		return 0;
	}
	
	

}
