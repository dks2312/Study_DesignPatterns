package Factory_Decorator;

public class DecoratorPattern {
	public static void main(String[] args) {

		FighterFactory compFactory = new FighterFactory();
		
		compFactory.getFighter(false, false, false).attack();
		// 탄환 발사

		compFactory.getFighter(false, true, false).attack();
		// 탄환 발사
		// 레이저 발사

		compFactory.getFighter(true, true, true).attack();
		// 탄환 발사
		// 레이저 발사
		// 미사일 발사
		// 플라즈마 발사
	}
}