package filme.site.modelos;

public class Titulo {
	private String nome;
	private int anoLancamento;
	private boolean incluidoPlano;
	private double somaAvaliacoes;
	private int totalAvaliacao;
	private int duracao;
	
	public int getTotalAvaliacao() {
		return totalAvaliacao;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public void setIncluidoPlano(boolean incluidoPlano) {
		this.incluidoPlano = incluidoPlano;
	}
	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getAnoLancamento() {
		return anoLancamento;
	}
	
	public int getDuracao() {
		return duracao;
	}
	
	public void exibeFichaTecnica(){
		System.out.println("Nome do filme: " + nome);
		System.out.println("Ano de lançamento do filme: " + anoLancamento);
	}
	
	public void avalia(double nota) {
		somaAvaliacoes += nota;
		totalAvaliacao ++;
	}
	
	public double pegaMedia() {
		return somaAvaliacoes/totalAvaliacao;
	}
}
