package Factory_Decorator;

public class DecoratorPattern {
	public static void main(String[] args) {

		FighterFactory compFactory = new FighterFactory();
		
		compFactory.getFighter(false, false, false).attack();
		// źȯ �߻�

		compFactory.getFighter(false, true, false).attack();
		// źȯ �߻�
		// ������ �߻�

		compFactory.getFighter(true, true, true).attack();
		// źȯ �߻�
		// ������ �߻�
		// �̻��� �߻�
		// �ö�� �߻�
	}
}