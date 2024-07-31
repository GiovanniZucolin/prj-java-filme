package filme.site.modelos;

public class Serie extends Titulo {

	private int temporadas;
	private boolean ativa;
	private int epsPorTemp;
	private int minsPorEps;
	
	public int getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public int getEpsPorTemp() {
		return epsPorTemp;
	}
	public void setEpsPorTemp(int epsPorTemp) {
		this.epsPorTemp = epsPorTemp;
	}
	public int getMinsPorEps() {
		return minsPorEps;
	}
	public void setMinsPorEps(int minsPorEps) {
		this.minsPorEps = minsPorEps;
	}
	
	@Override
	public int getDuracao() {
		return temporadas * epsPorTemp * minsPorEps;
	}
	
}
