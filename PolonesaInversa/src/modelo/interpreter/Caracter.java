package modelo.interpreter;

public class Caracter {
	private String valor;
	
	public Caracter(String valor) {
		this.valor = valor;
	}
	
	public String getValor() {
		return valor;
	}
	
	public boolean equals(Object outroObjeto) {
		if (this == outroObjeto) return true;
		if (!(outroObjeto instanceof Caracter)) return false;
		Caracter outroCaracter = (Caracter) outroObjeto;
		return getValor().equals(outroCaracter.getValor());
	}
	
	public String toString() {
		return getValor();
	}
}
