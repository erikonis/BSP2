public class IntervalFilter extends Filter {

	private int minimum;
	private int maximum;

	public IntervalFilter(int minimum, int maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

	@Override
	public boolean check(int i) {
		return i >= this.minimum && i <= this.maximum;
	}
}