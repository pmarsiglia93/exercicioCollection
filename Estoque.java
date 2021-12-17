package br.com.generation.collectionsex;

public class Estoque {
	
	private String produto;
	private double valor;
	
	
	public Estoque(double v, String p) {
		super();
		this.produto = p;
		this.valor = v;
		
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Estoque [produto = " + produto + ", valor = " + valor + "]";
	}


	
	
	
	
	

}
