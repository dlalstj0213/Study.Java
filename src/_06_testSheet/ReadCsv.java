package _06_testSheet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadCsv {

	String path = "C:/RHIE/eclipse-workspace/Study.Java/src";
	String pathTemp = "C:/RHIE/eclipse-workspace/Study.Java/temp";

	ReadCsv(){};

	ReadCsv(String path){
		this.path = path;
	}

	ReadCsv(String path, String pathTemp){
		this.path = path;
		this.pathTemp = pathTemp;
	}

	public List<String[]> readCsv(String fileNm) {
		List<String[]> list = new ArrayList<String[]>();

		File file = convertAll2UTF8(fileNm);

		FileInputStream fis = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader br = null;

		try {
			fis = new FileInputStream(new File(path + "/" +fileNm));
			inputStreamReader = new InputStreamReader(fis, Charset.forName("UTF-8"));
			br = new BufferedReader(inputStreamReader);

			String str = null;
			while((str = br.readLine()) != null) {
				String[] data = str.split(",");
				list.add(data);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(file.exists()) file.delete();
			try {
				fis.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public File convertAll2UTF8(String fileNm) {
		File file = new File(path + "/" + fileNm);
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader  br = null;

		File temp = new File(pathTemp);
		if(!temp.exists()) {
			temp.mkdirs();
		}

		try {
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);

			File copyFile = new File(pathTemp + "/" + fileNm);
			if(copyFile.exists()) {
				copyFile.delete();
			}
			
			FileOutputStream fos = new FileOutputStream(copyFile);
			Writer w = new OutputStreamWriter(fos);
			PrintWriter pw = new PrintWriter(w);
			String str = null;
			while((str =  br.readLine()) != null) {
				pw.write("\uFEFF");
				pw.println(str);
			}

			w.close();
			pw.close();
			fos.close();

			return copyFile;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public static void main(String[] args) {
		ReadCsv rc = new ReadCsv();
		List<String[]> list = rc.readCsv("testCSV.csv");
		list.forEach(item -> System.out.println(Arrays.toString(item)));

	}

}
