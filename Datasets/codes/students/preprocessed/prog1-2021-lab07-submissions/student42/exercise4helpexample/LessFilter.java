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