public class DivisibleByFilter extends Filter {

	private int divisor;

	public DivisibleByFilter(int divisor) {
		this.divisor = divisor;
	}

	@Override
	public boolean check(int i) {
		return i % this.divisor == 0;
	}
}