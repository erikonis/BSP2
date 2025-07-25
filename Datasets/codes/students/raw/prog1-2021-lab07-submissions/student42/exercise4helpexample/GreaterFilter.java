package lu.uni.programming1.lab7.exercise4helpexample;

public class GreaterFilter extends Filter {

	private int minimum;

	public GreaterFilter(int minimum) {
		this.minimum = minimum;
	}

	@Override
	public boolean check(int i) {
		return i >= this.minimum;
	}
}