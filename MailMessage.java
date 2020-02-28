
public class MailMessage {
	
	private String from, to, content;
	
	public MailMessage(String from, String to, String content) {
		this.from = from;
		this.to = to;
		this.content = content;
	}

	public String getFrom() {
		return from;
	}

	public String getContent() {
		return content;
	}

	public String getTo() {
		return to;
	}
	
}
