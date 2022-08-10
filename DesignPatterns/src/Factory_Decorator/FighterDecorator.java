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
		System.out.println("������ �߻�");
	}
}

class MissileDecorator extends FighterDecorator {
	public MissileDecorator(Fighter _decoratedFighter) { super(_decoratedFighter); }

	@Override
	public void attack() {
		super.attack();
		System.out.println("�̻��� �߻�");
	}
}

class PlasmaDecorator extends FighterDecorator {
	public PlasmaDecorator(Fighter _decoratedFighter) { super(_decoratedFighter); }

	@Override
	public void attack() {
		super.attack();
		System.out.println("�ö�� �߻�");
	}
}