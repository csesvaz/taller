package es.mde.entidades;

import java.util.ArrayList;
import java.util.Collection;

import com.kzurro.electrodomesticos.Lavadora;

public class LavadoraReparable extends Lavadora implements Reparable {

	private Collection<Averia> averias;
	
	protected void setAverias(Collection<Averia> averias) {
		if (getAverias() == null) {
			this.averias = new ArrayList<Averia>();
			this.averias.addAll(averias);
		} else {
			this.averias.addAll(averias);
		}
	}

	public Collection<Averia> getAverias() {
		return this.averias;
	}

	/**
	 * @param precioBase
	 * @param peso
	 * @param i
	 * @param color
	 * @param carga
	 * @param averias
	 */
	public LavadoraReparable(double precioBase, double peso, int i, String color, int carga,
			Collection<Averia> averias) {
		super();
		setAverias(averias);
	}

	public LavadoraReparable(int precioBase, int peso, int i, Object color, int carga, Object averias2) {
	
	}
	
}
