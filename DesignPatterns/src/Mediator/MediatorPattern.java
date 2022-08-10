package Mediator;

public class MediatorPattern {
	public static void main(String[] args) {

		ModeSwitch modeSwitch = new ModeSwitch();
		ModeMediator modeMediator = new ModeMediator();

		modeSwitch.setModeMediator(modeMediator);

		modeMediator.addListener(new ListView());
		modeMediator.addListener(new GalleryView());
		modeMediator.addListener(new DataDownloader());

		modeSwitch.toggleMode();
		// ����Ʈ�� ����
		// �������� ������
		// ��������� ������ �ٿ�ε�

		modeSwitch.toggleMode();
		// ����Ʈ�� ������
		// �������� ����
		// ����Ʈ��� ������ �ٿ�ε�
	}
}