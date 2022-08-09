package Proxy;

interface Thumbnail {
	public void showTitle();
	public void showPreview();
}

class RealThumbnail implements Thumbnail{
	private String title;
	private String movieUrl;
	
	public RealThumbnail(String title, String movieUrl) {
		this.title = title;
		this.movieUrl = movieUrl;
		
		System.out.println(this.movieUrl +"�κ��� "+ this.title +"�� ���� ������ �ٿ�");
	}
	
	 public void showTitle() {
		 System.out.println("����: "+ title);
	 }

	public void showPreview() {
		System.out.println(title +"�� ������ ���");
	}
}

class ProxyThumbnail implements Thumbnail{
		private String title;
		private String movieUrl;
		
		private RealThumbnail realThumbnail = null;

		public ProxyThumbnail(String title, String movieUrl) {
			this.title = title;
			this.movieUrl = movieUrl;
		}

		public void showTitle() {
			System.out.println("����: "+ title);
		}

		@Override
		public void showPreview() {
			if(realThumbnail == null) {
				realThumbnail = new RealThumbnail(title, movieUrl);
			}
			realThumbnail.showPreview();
		}
	}