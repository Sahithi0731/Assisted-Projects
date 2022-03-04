package assistedproject21;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class append {
	public static void main(String[] args) {
		try {
			String data = " Java program of full stack development";
			File f1 = new File("D:\\file.txt");
			if(!f1.exists()) {
				f1.createNewFile();
			}
			FileWriter fileWritter = new FileWriter(f1.getName(),true);
			BufferedWriter bw = new BufferedWriter(fileWritter);
			bw.write(data);
			bw.close();
			System.out.println("Done");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
