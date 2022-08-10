package Abstract_factory;

class Console {

	private CompFactory lightCompFactory = new LightCompFactory();
	private CompFactory darkCompFactory = new DarkCompFactory();

	Component comp1;
	Component comp2;
	Component comp3;

	void withFactory() {
		comp1 = lightCompFactory.getComp(Usage.PRESS);
		comp2 = lightCompFactory.getComp(Usage.TOGGLE);
		comp3 = lightCompFactory.getComp(Usage.EXPAND);
		// ����Ʈ ��ư ����
		// ����Ʈ ����ġ ����
		// ����Ʈ ����ٿ� ����

		comp1 = darkCompFactory.getComp(Usage.PRESS);
		comp2 = darkCompFactory.getComp(Usage.TOGGLE);
		comp3 = darkCompFactory.getComp(Usage.EXPAND);
		// ��ũ ��ư ����
		// ��ũ ����ġ ����
		// ��ũ ����ٿ� ����
	}
}

enum Usage {
	PRESS, TOGGLE, EXPAND
}