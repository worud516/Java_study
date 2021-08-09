package File02;

import java.io.*;

public class File02 {
	public static void main(String[] args) {
		// ���Ϻ������α׷�
		FileReader fr;
		FileWriter fw;
		BufferedReader br;
		BufferedWriter bw;
		try {
			fr = new FileReader("prac2.txt");
			fw = new FileWriter("result2.txt");

			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			String line;
			while ((line = br.readLine()) != null) {
				bw.write(line);
			}
			bw.close();
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
