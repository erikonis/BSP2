package lu.uni.programming1.lab7.exercise4helpexample;

public class LessFilter extends Filter {

	private int maximum;

	public LessFilter(int maximum) {
		this.maximum = maximum;
	}

	@Override
	public boolean check(int i) {
		return i < this.maximum;
	}
}