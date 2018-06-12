package µ¥ÀýÄ£Ê½;

public class lazy {
	private lazy () {}
	private static lazy h;
	public static lazy get() {
		if(h==null){
			h=new lazy();
		}
			return h;
	}
}
