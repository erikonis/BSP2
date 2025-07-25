public class PositiveFilter extends Filter {

	@Override
	public boolean check(int i) {
		return i >= 0;
	}
}