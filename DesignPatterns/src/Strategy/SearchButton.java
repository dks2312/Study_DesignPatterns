package Strategy;

public class SearchButton {
	@SuppressWarnings("unused")
	private MyProgram myProgram;	// 실제 화면에 출력하기 위한 접근(없으니 패스)
	
	public SearchButton(MyProgram myProgram) {
		this.myProgram = myProgram;	
	}
	
	private SearchStrategy searchStrategy = new SearchStrategyAll();
	
	public void setSearchStrategy (SearchStrategy searchStrategy) {
		this.searchStrategy = searchStrategy;
	}
	
	public void onClick() {
		searchStrategy.search();
	}
}