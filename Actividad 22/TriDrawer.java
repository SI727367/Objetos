public class TriDrawer<T1,T2,T3> {
	private T1 object1=null;
	private T2 object2=null;
	private T3 object3=null;
	
	public void put1(T1 object1) {
		if(this.object1==null)
			this.object1=object1;
	}
	
	public void put2(T2 object2) {
		if(this.object2==null)
			this.object2=object2;
	}
	
	public void put3(T3 object3) {
		if(this.object3==null)
			this.object3=object3;
	}

	public T1 peek1() {
		return this.object1;
	}
	
	public T2 peek2() {
		return this.object2;
	}
	
	public T3 peek3() {
		return this.object3;
	}

	public T1 remove1() {
		T1 object1=this.object1;
		this.object1=null;
		return(object1);
	}
	
	public T2 remove2() {
		T2 object2=this.object2;
		this.object2=null;
		return(object2);
	}

	public T3 remove3() {
		T3 object3=this.object3;
		this.object3=null;
		return(object3);
	}


}
