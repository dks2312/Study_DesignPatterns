package Proxy;

import java.util.ArrayList;

public class MyProgram {

	public static void main(String[] args) {
		ArrayList<Thumbnail> thumbnails = new ArrayList<Thumbnail>();
		
		thumbnails.add(new ProxyThumbnail("����1", "thum1.mp4"));
		thumbnails.add(new ProxyThumbnail("����2", "thum2.mp4"));
		thumbnails.add(new ProxyThumbnail("����3", "thum3.mp4"));
		thumbnails.add(new ProxyThumbnail("����4", "thum4.mp4"));
		thumbnails.add(new ProxyThumbnail("����5", "thum5.mp4"));
		
		for(Thumbnail thumbnail : thumbnails) {
			thumbnail.showTitle();
		}
		
		thumbnails.get(2).showPreview();
		thumbnails.get(2).showPreview();
		thumbnails.get(4).showPreview();
		thumbnails.get(1).showPreview();
		thumbnails.get(3).showPreview();
		thumbnails.get(3).showPreview();
		thumbnails.get(3).showPreview();
		thumbnails.get(3).showPreview();
		thumbnails.get(3).showPreview();
	}
}
