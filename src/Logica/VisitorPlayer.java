package Logica;

public class VisitorPlayer extends Visitor{

	protected Player player;
	
	public VisitorPlayer(Player player) {
		this.player = player;
	}

	@Override
	public void visitarEnemigoAlpha(Alpha alpha) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitarEnemigoBeta(Beta beta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitarPlayer(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitarProyectilArmaSanitaria(ProyectilArmaSanitaria proyectil) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitarPremioPocion(PocionEspecial premio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitarPremioCuarentena(EfectoCuarentena efecto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitarPremioSuperArma(EfectoSuperArmaSanitaria efecto) {
		// TODO Auto-generated method stub
		
	}
	}
