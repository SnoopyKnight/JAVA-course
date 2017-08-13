package document;

public class Document {
	protected String text;
	public Document(){
		text = " this is a JAVA test ";
	}
	
	public Document(String text){
		this.text = text ;
	}
	
	
	public String getText(){
		return text;
	}
	
	public void setText(String newText){
		text = newText;
	}
	public String toString(){
		String result = " ";
		result = this.text;
		return result;
	}
	
	public Boolean ContainsKeyword (Email mail1, String keyword){
		if (mail1.toString().indexOf(keyword,0) >= 0)
			return true;
		return false;
	}
	
	public Boolean ContainsKeyword (File obj1, String keyword){
		if (obj1.toString().indexOf(keyword,0) >= 0)
			return true;
		return false;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email mail = new Email("Bruce", "Tony","Java is useful.");
		File obj = new File("D:datafile.txt");
		
		mail.getSender();
		
		if ( mail.ContainsKeyword(mail, "Java") == true)
			System.out.printf("Email is Correct!");
		else
			System.out.printf("Somethig goes wrong!");
		
		if( mail.ContainsKeyword(obj, "D:datafile.txt") == true)
			System.out.printf("File is Correct!");
		else
			System.out.printf("Somethig goes wrong!");
	}

}



class Email extends Document {
	private String sender;
	private String recipient;
	private String title;
	
	public Email(){
		super();
		this.sender = "Snoopy";
		this.recipient = "Kitty";
		this.title = "Hi";
	}
	
	public Email(String sender, String recipient, String title){
		super(title);
		this.sender = sender;
		this.recipient = recipient;
		this.title = title;
	}
	
	public String getSender(){
		return sender;
	}
	
	public String getRecipient(){
		return recipient;
	}
	
	public String title(){
		return title;
	}
	
	public void setSender(String newSender){
		sender = newSender;
	}
	
	public void setRecipient(String newRecipient){
		recipient = newRecipient;
	}
	
	public void setTitle(String newTitle){
		title = newTitle;
	}
	
	public String toString(){
		String result = " ";
		result = this.sender +","+ this.recipient +","+ this.title;
		return result;
	}
	
}



class File extends Document{
	private String pathname;
	
	public File(){
		super();
		this.pathname = "No path found";
	}
	
	public File(String pathname){
		super(pathname);
		this.pathname = pathname;
	}
	
	public String getPathname(){
		return pathname;
	}
	
	public void setPathname(String newPathname){
		pathname = newPathname;
	}
	public String toString(){
		String result = " ";
		result = this.pathname;
		return result;
	}
}
