package Template_method;

public class NaverMapView extends MapView {

	@Override
	protected void connectMapServer() {
		System.out.println("���̹� ���� ������ ����");
	};

	@Override
	protected void showMapOnScreen() {
		System.out.println("���̹� ������ ������");
	};

	@Override
	protected void moveToCurrentLocation() {
		System.out.println("���̹� �������� �� ��ǥ�� �̵�");
	};
}
