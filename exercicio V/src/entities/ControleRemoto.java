package entities;

public class ControleRemoto {

	private Integer canal;
	private Integer volume;
	
	public ControleRemoto() {
		
	}
	
	public ControleRemoto(Integer canal, Integer volume) {
		this.canal = canal;
		this.volume = volume;
	}

	public Integer getCanal() {
		return canal;
	}

	public void setCanal(Integer canal) {
		this.canal = canal;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}
	
	public void diminuirVolume() {
		this.volume--;
	}
	
	public void aumentarVolume() {
		this.volume++;
	}
	
	public void diminuirCanal() {
		this.canal--;
	}
	
	public void aumentarCanal() {
		this.canal++;
	}
	
	public void trocarCanal(Integer novoCanal) {
		this.canal = novoCanal;
	}
	
	public String mostrarInformações() {
		return "Canal atual: " + canal +  "\nVolume atual: " + volume + "\n";
	}
	
}
