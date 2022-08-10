package Abstract_factory;

abstract class Component {
	protected abstract String getCompName();

	public Component() {
		System.out.println(this.getCompName() + " ����");
	}
}

class LightButton extends Component {
	@Override
	protected String getCompName() {
		return "����Ʈ ��ư";
	}
}

class DarkButton extends Component {
	@Override
	protected String getCompName() {
		return "��ũ ��ư";
	}
}

class LightSwitch extends Component {
	@Override
	protected String getCompName() {
		return "����Ʈ ����ġ";
	}
}

class DarkSwitch extends Component {
	@Override
	protected String getCompName() {
		return "��ũ ����ġ";
	}
}

class LightDropdown extends Component {
	@Override
	protected String getCompName() {
		return "����Ʈ ����ٿ�";
	}
}

class DarkDropdown extends Component {
	@Override
	protected String getCompName() {
		return "��ũ ����ٿ�";
	}
}