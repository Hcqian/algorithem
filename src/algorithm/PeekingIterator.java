package algorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class PeekingIterator implements Iterator<Integer> {
	private Iterator<Integer> it = null;
	private Integer next = null;

	public PeekingIterator(Iterator<Integer> iterator) {
		// initialize any member here.
		if (iterator.hasNext()) {
			next = iterator.next();
		}
		it = iterator;
	}

	// Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		return next;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		int a=next;
		next=it.hasNext()?it.next():null;
		return a;
	}

	@Override
	public boolean hasNext() {
		return next!=null;

	}
}
