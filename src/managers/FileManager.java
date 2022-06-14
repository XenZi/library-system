package managers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
	
	public static String readFile(String path) {
		String fileContent = "";
		File file = new File(path);
		if (file.exists()) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String readLine = "";
				while((readLine = reader.readLine()) != null) {
					fileContent += readLine + '\n';
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		}
		else {
			return null;
		}
		
		return fileContent;
	}
	
	public static boolean writeFile(String path, String content) {
		if (path.isEmpty()) {
			writeFile("src/txt/log.txt", "Erorr while reading");
			return false;
		}
		else {
			try {
				String exContent = readFile(path);
				FileWriter writer = new FileWriter(path);
				writer.write(exContent + content);
				writer.close();
			} catch(IOException e) {
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}
	
	public static boolean removeContent(String path) {
		try {
			FileWriter writer = new FileWriter(path);
			writer.write("");
			writer.close();
		} catch(IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public static boolean updateFile(String path, String content) {
		if(path.isEmpty()) {
			writeFile("src/txt/log.txt", "Error while updating");
			return false;
		}
		else {
			try {
				String exContent = readFile(path);
				String newContent = "";
				String[] test = exContent.split("\n");
				String id = content.split("\\|")[0];
				for(String line: test) {
					String[] splittedLine = line.split("\\|");
					if (splittedLine[0].equals(id)) {
						line = content;
					}
					newContent += line + "\n";
				}
				if (removeContent(path)) {
					writeFile(path, newContent);
				}
				else {
					return false;
				}
			} catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}

}
