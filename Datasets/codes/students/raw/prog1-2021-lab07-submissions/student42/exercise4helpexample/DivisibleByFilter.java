package lu.uni.programming1.lab7.exercise4helpexample;

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