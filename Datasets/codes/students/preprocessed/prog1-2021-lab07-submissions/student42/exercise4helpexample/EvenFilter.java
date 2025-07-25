public class EvenFilter extends Filter {

	@Override
	public boolean check(int i) {
		return i % 2 == 0;
	}
}