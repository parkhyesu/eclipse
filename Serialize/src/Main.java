import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		
		

	}
	
	
	public static void writeObjects() {
		
		ArrayList<Contact> contacts = new ArrayList<Contact>();
		
		for (int i = 0; i < 3; i++) {
			Contact contact = new Contact();
			contact.setFirstName("길동"+i);
			contact.setLastName("홍");
			contacts.add(contact);
		}
		
		try {
			FileOutputStream os = new FileOutputStream("contacts.dat");
			ObjectOutputStream output = new ObjectOutputStream(os);
			
			
			//직렬화 객체를 읽을때 저장 개수를 알수 없어서, 이문제를 해결하기위해.
			//저장된 객체의 수를 우선 저장한다.
			output.writeInt(contacts.size());
			for (Contact contact : contacts) {
				output.writeObject(contact);
			}	//여기가지의 4 줄을
				//output.writeObject(contacts); 이 한줄로 할 수 있음.
		
			output.flush();
			output.close();
			os.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
