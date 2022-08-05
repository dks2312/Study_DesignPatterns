package State;

public interface ModeState {
	public void toggle (ModeSwitch modeSwitch);
}

class ModeStateLight implements ModeState{
	@Override
	public void toggle(ModeSwitch modeSwitch) {
		System.out.println("FROM LIGHT TO DARK");
		/* ȭ���� ��Ӱ� �ϴ� �ڵ� */
		modeSwitch.setState(new ModeStateDark());
	}
}

class ModeStateDark implements ModeState{
	@Override
	public void toggle(ModeSwitch modeSwitch) {
		System.out.println("FROM LIGHT TO LIGHT");
		/* ȭ���� ��� �ϴ� �ڵ� */
		modeSwitch.setState(new ModeStateLight());
	}
}