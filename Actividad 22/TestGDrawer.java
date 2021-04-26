import com.iteso.TriDrawer;
import com.iteso.GDrawer;
import com.iteso.RGBColor;

public class TestGDrawer {

	public static void main(String[] args) {
		GDrawer<String> gd1=new GDrawer<>();
		GDrawer<Integer> gd2=new GDrawer<>();
		GDrawer<RGBColor> gdColor=new GDrawer<>();
		GDrawer<TriDrawer> gdt = new GDrawer<>();
		
		TriDrawer<Integer,String,String> td1=new TriDrawer<>();
		
		gd1.put("hola");
		gd2.put(5);
		gdColor.put(new RGBColor(100,200,150));
		
		String s1=gd1.peek();
		int x = gd2.peek();
		
		System.out.println(gdColor.peek());
		
		td1.put1(14088);
		td1.put2("ISC");
		td1.put3("José Luis Elvira");
		
		gdt.put(td1);
		
		System.out.println(gdt.peek().peek3());
	}

}
