import java.io.*;

public class Main {

	public static void main(String[] args) {
		RandomAccessFile file = null;
		
		try {
			file = new RandomAccessFile("db.dat", "rw");	//read mode : "r" write mode : "w"
			
			//���� ���� �������?
			System.out.format("file size : %d\n", file.length());		
			
			//���� ���� �������� ��ġ��?
			System.out.format("current position : %d\n", file.getFilePointer());
			
			//������ ������ ������?
			file.seek(1000);
			System.out.println("after seek(1000)");
			
			//���� ���� �������?
			System.out.format("file size : %d\n", file.length());
			
			//���� ���� �������� ��ġ��?
			System.out.format("current position : %d\n", file.getFilePointer());
			
			
		}catch (Exception ex) {
			ex.printStackTrace();
			
		}finally {						//�տ��� ������ �ϵ� �� �ϵ� finally�� ������ ���İ�.
			try {
				if(file != null) {
					file.close();
				}
			}catch (Exception ex) {
				ex.printStackTrace();
			}
		}

	}

}
