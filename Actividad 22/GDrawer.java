public class GDrawer<T> {
	private T o=null;
	
	public void put(T o) {
		if(this.o==null)
			this.o=o;
	}
	public T peek() {
		return this.o;
	}
	public T remove() {
		T o=this.o;
		this.o=null;
		return o;
	}

	@Override
	public String toString() {
		return "GDrawer{" +
				"o=" + o +
				'}';
	}
}

