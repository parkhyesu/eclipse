import java.io.*;

public class Main {

	public static void main(String[] args) {
		RandomAccessFile file = null;
		
		try {
			file = new RandomAccessFile("db.dat", "rw");	//read mode : "r" write mode : "w"
			
			//현재 파일 사이즈는?
			System.out.format("file size : %d\n", file.length());		
			
			//현재 파일 포인터의 위치는?
			System.out.format("current position : %d\n", file.getFilePointer());
			
			//파일의 오프셋 변경은?
			file.seek(1000);
			System.out.println("after seek(1000)");
			
			//현재 파일 사이즈는?
			System.out.format("file size : %d\n", file.length());
			
			//현재 파일 포인터의 위치는?
			System.out.format("current position : %d\n", file.getFilePointer());
			
			
		}catch (Exception ex) {
			ex.printStackTrace();
			
		}finally {						//앞에서 리턴을 하든 뭘 하든 finally는 무조건 거쳐감.
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
