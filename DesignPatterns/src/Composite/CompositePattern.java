package Composite;

public class CompositePattern {
	public static void main(String[] args) {
		Folder schoolFolder = new Folder("�б�");

		Folder grade1Folder = new Folder("1�г�");
		Folder grade2Folder = new Folder("2�г�");

		schoolFolder.add(grade1Folder);
		schoolFolder.add(grade2Folder);

		File enterPhoto = new File("���л���", 256);
		grade1Folder.add(enterPhoto);

		Folder sem1Folder = new Folder("1�б�");
		Folder sem2Folder = new Folder("2�б�");

		grade2Folder.add(sem1Folder);
		grade2Folder.add(sem2Folder);

		File lecturePlan = new File("���ǰ�ȹ��", 120);
		sem1Folder.add(lecturePlan);

		Folder projFolder = new Folder("������Ʈ");
		sem2Folder.add(projFolder);

		File draft = new File("�巡��Ʈ", 488);
		File finalResult = new File("�����", 560);

		projFolder.add(draft);
		projFolder.add(finalResult);

		schoolFolder.getSize();
		// ���л������� ũ�� : 256
		// 1�г����� ũ�� : 256
		// - - - - -
		// ���ǰ�ȹ������ ũ�� : 120
		// 1�б����� ũ�� : 120
		// - - - - -
		// �巡��Ʈ���� ũ�� : 488
		// ��������� ũ�� : 560
		// ������Ʈ���� ũ�� : 1048
		// - - - - -
		// 2�б����� ũ�� : 1048
		// - - - - -
		// 2�г����� ũ�� : 1168
		// - - - - -
		// �б����� ũ�� : 1424
		// - - - - -

		schoolFolder.remove();
		// ���л��� ���� ����
		// 1�г� ���� ����
		// - - - - -
		// ���ǰ�ȹ�� ���� ����
		// 1�б� ���� ����
		// - - - - -
		// �巡��Ʈ ���� ����
		// ����� ���� ����
		// ������Ʈ ���� ����
		// - - - - -
		// 2�б� ���� ����
		// - - - - -
		// 2�г� ���� ����
		// - - - - -
		// �б� ���� ����
		// - - - - -
	}
}