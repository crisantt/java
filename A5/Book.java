public class Book {

	private String name;
	private String auth;
	private String publisher;
	private String edition;

	public void Book(String name, String auth, String publisher, String edition) {
		this.name = name;
		this.auth = auth;
		this.publisher = publisher;
		this.edition = edition;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return auth;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getEdition() {
		return edition;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String auth) {
		this.auth = auth;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public void setDetails(String name, String auth, String publisher, String edition) {
		this.name = name;
		this.auth = auth;
		this.publisher = publisher;
		this.edition = edition;
	}

	@Override
	public String toString() {
		return "\nName: " + name + "\nAuthor: " + auth + "\nPublisher:" + publisher + "\nEdition: " + edition;
	}
}
