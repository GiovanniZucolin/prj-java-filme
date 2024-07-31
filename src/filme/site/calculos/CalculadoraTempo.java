package filme.site.calculos;

import filme.site.modelos.Titulo;

public class CalculadoraTempo {

	private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo t) {
        this.tempoTotal += t.getDuracao();
    }
	
}
