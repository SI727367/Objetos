public class RGBColor {
	private int red=0,green=0,blue=0;
	
	public RGBColor() {};
	
	public RGBColor(int red,int green,int blue) {
		setRed(red);
		setGreen(green);
		setBlue(blue);
	}
	
	public void setRed(int red) {
		if(red>=0 && red<=255)
			this.red=red;
	}
	public void setGreen(int green) {
		if(green>=0 && green<=255)
			this.green=green;
	}
	public void setBlue(int blue) {
		if(blue>=0 && blue<=255)
			this.blue=blue;
	}

	public String toString() {
		return "{red:"+red+",green:"+green+",blue:"+blue+"}";
	}
}

