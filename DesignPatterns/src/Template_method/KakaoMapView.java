package Template_method;

public class KakaoMapView extends MapView {

	@Override
	protected void connectMapServer() {
		System.out.println("īī�� ���� ������ ����");
	};

	@Override
	protected void showMapOnScreen() {
		System.out.println("īī�� ������ ������");
	};

	@Override
	protected void moveToCurrentLocation() {
		System.out.println("īī�� �������� �� ��ǥ�� �̵�");
	};
}