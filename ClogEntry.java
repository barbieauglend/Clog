/**
 * Class is responsible for characterizing the blog entry object
 */
public class ClogEntry {
	
	private String _content;
	private String _title;
	
	/**
	 * Constructor initializes some IVs
	 * @param title = used to initialize title IV
	 * @param content = used to initialize content IV
	 */
	public ClogEntry(String title, String content) {
		_title = title;
		_content = content;
	}

	public void setContent(String newContent){
		_content = newContent;
	}
	
	/**
	 * toString() characterizes an individual blog entry
	 */
	public String toString() {
		
		String info = _title + "\n" + _content  + "\n";
		return info;
	}
}