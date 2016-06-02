import java.util.ArrayList;

public class BlogEntry {
	
	private Text content;
	private Titel title;
	
	public BlogEntry(Titel t, Text c) {
		
		title = t;
		content = c;
		
	}
	
        public String toString() {
		
		String info = title + "\n" + content  + "\n";
		return info;
	}
}