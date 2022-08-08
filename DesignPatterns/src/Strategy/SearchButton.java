package Strategy;

public class SearchButton {
	@SuppressWarnings("unused")
	private MyProgram myProgram;	// ���� ȭ�鿡 ����ϱ� ���� ����(������ �н�)
	
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