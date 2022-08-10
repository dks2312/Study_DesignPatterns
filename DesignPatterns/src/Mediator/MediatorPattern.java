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
		// ∏ÆΩ∫∆Æ∫‰ ∞®√„
		// ∞∂∑Ø∏Æ∫‰ ∫∏ø©¡‹
		// ∞∂∑Ø∏Æ∫‰øÎ µ•¿Ã≈Õ ¥ŸøÓ∑ŒµÂ

		modeSwitch.toggleMode();
		// ∏ÆΩ∫∆Æ∫‰ ∫∏ø©¡‹
		// ∞∂∑Ø∏Æ∫‰ ∞®√„
		// ∏ÆΩ∫∆Æ∫‰øÎ µ•¿Ã≈Õ ¥ŸøÓ∑ŒµÂ
	}
}