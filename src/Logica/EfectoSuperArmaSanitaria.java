package Logica;

public class EfectoSuperArmaSanitaria extends EfectoTemporal{
	protected Player player;
	
	public void cambiarArma() {
		Arma nuevaArma = new SuperArmaSanitaria();
		Arma armaPlayer = player.getArma();
		player.setArma(nuevaArma);
		//Thread ??? Hacer un hold del tiempo
		player.setArma(armaPlayer);
	}
}
