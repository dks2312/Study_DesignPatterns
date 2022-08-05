package Strategy;

interface SearchStrategy {
	public void search();
}

class SearchStrategyAll implements SearchStrategy{
	@Override
	public void search() {
		System.out.println("SEARCH ALL");
		/* ��ü �˻��ϴ� �ڵ� */
	}
}

class SearchStrategyImage implements SearchStrategy{
	@Override
	public void search() {
		System.out.println("SEARCH IMAGE");
		/* �̹��� �˻��ϴ� �ڵ� */
	}
}

class SearchStrategyNews implements SearchStrategy{
	@Override
	public void search() {
		System.out.println("SEARCH NEWS");
		/* ���� �˻��ϴ� �ڵ� */
	}
}

class SearchStrategyMap implements SearchStrategy{
	@Override
	public void search() {
		System.out.println("SEARCH MAP");
		/* ���� �˻��ϴ� �ڵ� */
	}
}
