package HW_Creating_Child_Classes;

public class MtgFormat{
	private boolean play;
	private String format;
	private String meta;
	
	public MtgFormat(String format, boolean play, String meta) {
		this.format=format;
		this.play = play;
		this.meta = meta;
	}
	
	public String toString() {
		if(play)
			return "format: " + format + " do I play it?: yes " + "what is the meta?" + meta;
		else
			return "format: " + format + " do I play it?: no " + "what is the meta?" + meta;
	}
	
}
