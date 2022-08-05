package Strategy;

interface SearchStrategy {
	public void search();
}

class SearchStrategyAll implements SearchStrategy{
	@Override
	public void search() {
		System.out.println("SEARCH ALL");
		/* 전체 검색하는 코드 */
	}
}

class SearchStrategyImage implements SearchStrategy{
	@Override
	public void search() {
		System.out.println("SEARCH IMAGE");
		/* 이미지 검색하는 코드 */
	}
}

class SearchStrategyNews implements SearchStrategy{
	@Override
	public void search() {
		System.out.println("SEARCH NEWS");
		/* 뉴스 검색하는 코드 */
	}
}

class SearchStrategyMap implements SearchStrategy{
	@Override
	public void search() {
		System.out.println("SEARCH MAP");
		/* 지도 검색하는 코드 */
	}
}
