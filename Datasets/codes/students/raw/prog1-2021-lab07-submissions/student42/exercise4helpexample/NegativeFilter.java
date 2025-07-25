package lu.uni.programming1.lab7.exercise4helpexample;

public class NegativeFilter extends Filter {

	@Override
	public boolean check(int i) {
		return i < 0;
	}
}