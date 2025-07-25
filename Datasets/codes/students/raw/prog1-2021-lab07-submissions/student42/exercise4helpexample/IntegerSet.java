package lu.uni.programming1.lab7.exercise4helpexample;

public class IntegerSet {

	private int[] elements;
	private int nextElement;

	public IntegerSet(int numberOfElements) {
		this.elements = new int[numberOfElements];
		this.nextElement = 0;
	}

	public IntegerSet(int[] elements) {
		this.elements = elements;
		this.nextElement = this.count();
	}

	public boolean add(int i) {
		if (this.nextElement < this.count()) {
			this.elements[this.nextElement++] = i;
			return true;
		}
		return false;
	}

	public void addRange(int[] array) {
		for (int i = 0; i < array.length && this.add(array[i]); i++) {
		}
	}

	public int getElementAt(int index) {
		return this.elements[Math.max(Math.min(index, this.elements.length), 0)];
	}

	public int count() {
		return this.elements.length;
	}

	public void printSet() {
		System.out.print("[");
		for (int i = 0; i < this.nextElement; i++) {
			System.out.print(this.getElementAt(i) + (i != this.nextElement - 1 ? ", " : ""));
		}
		System.out.println("]");
	}

	public IntegerSet applyFilter(Filter filter) {
		IntegerSet newSet = new IntegerSet(this.count());

		int n;
		for (int i = 0; i < this.nextElement; i++) {
			n = this.getElementAt(i);
			if (filter.check(n)) {
				newSet.add(n);
			}
		}

		return newSet;
	}
}