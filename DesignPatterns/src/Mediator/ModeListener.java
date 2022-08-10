package Mediator;

public interface ModeListener {
	public void onModeChange(Mode mode);
}

class ListView implements ModeListener {
	@Override
	public void onModeChange(Mode mode) {
		System.out.println("∏ÆΩ∫∆Æ∫‰ " + (mode == Mode.LIST ? "∫∏ø©¡‹" : "∞®√„"));
	}
}

class GalleryView implements ModeListener {
	@Override
	public void onModeChange(Mode mode) {
		System.out.println("∞∂∑Ø∏Æ∫‰ " + (mode == Mode.GALLERY ? "∫∏ø©¡‹" : "∞®√„"));
	}
}

class DataDownloader implements ModeListener {
	@Override
	public void onModeChange(Mode mode) {
		System.out.println((mode == Mode.LIST ? "∏ÆΩ∫∆Æ" : "∞∂∑Ø∏Æ") + "∫‰øÎ µ•¿Ã≈Õ ¥ŸøÓ∑ŒµÂ");
	}
}