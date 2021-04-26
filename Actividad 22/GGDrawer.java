public class GGDrawer<GDrawer> {
    private GDrawer o=null;

    public void put(GDrawer o) {
        if(this.o==null)
            this.o=o;
    }
    public GDrawer peek() {
        return this.o;
    }
    public GDrawer remove() {
        GDrawer o=this.o;
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