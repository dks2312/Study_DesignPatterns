package Mediator;

public interface ModeListener {
	public void onModeChange(Mode mode);
}

class ListView implements ModeListener {
	@Override
	public void onModeChange(Mode mode) {
		System.out.println("����Ʈ�� " + (mode == Mode.LIST ? "������" : "����"));
	}
}

class GalleryView implements ModeListener {
	@Override
	public void onModeChange(Mode mode) {
		System.out.println("�������� " + (mode == Mode.GALLERY ? "������" : "����"));
	}
}

class DataDownloader implements ModeListener {
	@Override
	public void onModeChange(Mode mode) {
		System.out.println((mode == Mode.LIST ? "����Ʈ" : "������") + "��� ������ �ٿ�ε�");
	}
}