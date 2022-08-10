package Factory_Decorator;

public abstract class FighterDecorator implements Fighter {
	private Fighter decoratedFighter;

	public FighterDecorator(Fighter _decoratedFighter) {
		decoratedFighter = _decoratedFighter;
	}

	@Override
	public void attack() {
		decoratedFighter.attack();
	}
}

class LaserDecorator extends FighterDecorator {
	public LaserDecorator(Fighter _decoratedFighter) { super(_decoratedFighter); }

	@Override
	public void attack() {
		super.attack();
		System.out.println("레이저 발사");
	}
}

class MissileDecorator extends FighterDecorator {
	public MissileDecorator(Fighter _decoratedFighter) { super(_decoratedFighter); }

	@Override
	public void attack() {
		super.attack();
		System.out.println("미사일 발사");
	}
}

class PlasmaDecorator extends FighterDecorator {
	public PlasmaDecorator(Fighter _decoratedFighter) { super(_decoratedFighter); }

	@Override
	public void attack() {
		super.attack();
		System.out.println("플라즈마 발사");
	}
}