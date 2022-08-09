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
		
		System.out.println(this.movieUrl +"로부터 "+ this.title +"의 영상 데이터 다운");
	}
	
	 public void showTitle() {
		 System.out.println("제목: "+ title);
	 }

	public void showPreview() {
		System.out.println(title +"의 프리뷰 재생");
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
			System.out.println("제목: "+ title);
		}

		@Override
		public void showPreview() {
			if(realThumbnail == null) {
				realThumbnail = new RealThumbnail(title, movieUrl);
			}
			realThumbnail.showPreview();
		}
	}