package ExercicioProduto;

public class Produto {
	private String nome;
	private double pre�o;
	
	public Produto(String nome, double pre�o) {
		this.nome = nome;
		this.pre�o = pre�o;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	
	public String etiquetaPre�o() {
		return nome + " $ " + String.format("%.2f", pre�o);
	}
}