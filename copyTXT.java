package sooup;
import java.io.*;
import java.util.*;

public class copyTXT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� ������ ���� ��: ");
		String txt = sc.nextLine();
		System.out.print("���� ���� �� ������ ���: ");
		String dir = sc.nextLine();
		System.out.print("���� ���� �� ������ ���� ��: ");
		String name = sc.nextLine();
		
		File src = new File("C:\\Users\\mkkim\\eclipse-workspace\\soo-up\\src\\sooup\\" + txt + ".txt");
		File dest = new File(dir + name + ".txt");
		
		
		try {
			if(src.getPath().equals(dest.getPath())) {
				for(int i = 1; ;i++) {
					File reName = new File(dir + name + "(" + i +")" + ".txt");
					if(reName.exists()) {
						continue;
					}
					else {
						FileInputStream fi = new FileInputStream(src);
						FileOutputStream fo = new FileOutputStream(reName);
						byte [] buf = new byte [1024*100];
						while(true) {
							int n = fi.read(buf);
							fo.write(buf, 0, n);
							if(n < buf.length) {
								break;
							}
						}
						fi.close();
						fo.close();
						System.out.println(src.getPath() + "�� " + reName.getPath() + "�� �����Ͽ����ϴ�.");
						break;
					}
				}
			}
			
			else {
				FileInputStream fi = new FileInputStream(src);
				FileOutputStream fo = new FileOutputStream(dest);
				byte [] buf = new byte [1024*100];
				while(true) {
					int n = fi.read(buf);
					fo.write(buf, 0, n);
					if(n < buf.length) {
						break;
					}
				}
				fi.close();
				fo.close();
				System.out.println(src.getPath() + "�� " + dest.getPath() + "�� �����Ͽ����ϴ�.");
			}
		}catch (IOException e) { System.out.println("���� ���� ����"); }
	}
}
