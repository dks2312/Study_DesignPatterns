package Decorator;

public class DecoratorPattern {
	public static void main(String[] args) {

		new XWingFighter().attack();
		// źȯ �߻�

		new LaserDecorator(new XWingFighter()).attack();
		// źȯ �߻�
		// ������ �߻�

		new PlasmaDecorator(
				new MissileDecorator(
						new LaserDecorator(
								new XWingFighter()
									))).attack();
		// źȯ �߻�
		// ������ �߻�
		// �̻��� �߻�
		// �ö�� �߻�
	}
}