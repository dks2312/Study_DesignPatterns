package Command;

public class Robot {
	public enum Direction { LEFT, RIGHT}
	
	public void moveForward(int space) {
		System.out.println(space + " ĭ ����");
	}
	
	public void turn(Direction direction) {
		System.out.println((direction == Direction.LEFT ? "����" : "������") + "���� ������ȯ");
	}
	
	public void pickup() {
		System.out.println("���� ���� ������");
	}
}
