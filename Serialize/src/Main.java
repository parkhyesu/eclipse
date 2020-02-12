import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		
		

	}
	
	
	public static void writeObjects() {
		
		ArrayList<Contact> contacts = new ArrayList<Contact>();
		
		for (int i = 0; i < 3; i++) {
			Contact contact = new Contact();
			contact.setFirstName("�浿"+i);
			contact.setLastName("ȫ");
			contacts.add(contact);
		}
		
		try {
			FileOutputStream os = new FileOutputStream("contacts.dat");
			ObjectOutputStream output = new ObjectOutputStream(os);
			
			
			//����ȭ ��ü�� ������ ���� ������ �˼� ���, �̹����� �ذ��ϱ�����.
			//����� ��ü�� ���� �켱 �����Ѵ�.
			output.writeInt(contacts.size());
			for (Contact contact : contacts) {
				output.writeObject(contact);
			}	//���Ⱑ���� 4 ����
				//output.writeObject(contacts); �� ���ٷ� �� �� ����.
		
			output.flush();
			output.close();
			os.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
