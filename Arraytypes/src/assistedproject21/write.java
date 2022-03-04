package assistedproject21;
import java.io.FileWriter;
public class write {
	public static void main(String args[]) {
		try {
			FileWriter fw = new FileWriter("D:\\file.txt");
			fw.write("welcome to simplylearn java program");
			fw.close();
		}catch(Exception e) {
			System.out.println("Success....");
		}
	}
}
