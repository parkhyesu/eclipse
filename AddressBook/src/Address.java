import java.util.Set;

public interface Address {

	String getFirstName();
	
	void setFirstName(String firstName);
	
	String getLastName();
	
	void setLastName(String lastName);
	
	Set<String> getFieldNames();
	
	void addField(String filedName, String value);
	
}
