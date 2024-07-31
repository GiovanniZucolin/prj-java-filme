import filme.site.modelos.Episodio;
import filme.site.modelos.Filme;
import filme.site.modelos.Serie;
import filme.site.calculos.CalculadoraTempo;
import filme.site.calculos.FiltroRecomendacao;

public class Principal {

	public static void main(String[] args) {
		
		Filme filme = new Filme();
		filme.setNome("Ta dando onda");
		filme.setAnoLancamento(2007);
		filme.setDuracao(96);	
		filme.avalia(10);
		filme.exibeFichaTecnica();
		
		Filme filme2 = new Filme();
		filme2.setNome("Estômago");
		filme2.setAnoLancamento(2007);
		filme2.setDuracao(100);
		
		Serie lost = new Serie();
		lost.setNome("Lost");
		lost.setAnoLancamento(2000);
		lost.exibeFichaTecnica();
		lost.setTemporadas(10);
		lost.setEpsPorTemp(10);
		lost.setMinsPorEps(50);
		System.out.println("Duração da série: " + lost.getDuracao());
		
		CalculadoraTempo calculadora = new CalculadoraTempo();
	    calculadora.inclui(filme);
	    calculadora.inclui(filme2);
	    calculadora.inclui(lost);
	    System.out.println(calculadora.getTempoTotal());
	    
	    FiltroRecomendacao filtro = new FiltroRecomendacao();
	    filtro.filtra(filme);
	    
	    Episodio ep = new Episodio();
	    ep.setNumero(1);
	    ep.setSerie(lost);
	    ep.setTotalVisualizacoes(300);
	    filtro.filtra(ep);

	}

}
