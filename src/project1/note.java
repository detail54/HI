package project1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class note {

	public static void main(String[] args) {
		FileReader fi;
		try {
			fi = new FileReader("src/project1/Guest.txt");
			BufferedReader br = new BufferedReader(fi);

			ArrayList<String> ary_id = new ArrayList<String>();
			ArrayList<String> ary_pw = new ArrayList<String>();
			String read;

			while ((read = br.readLine()) != null) { // �ؽ�Ʈ ���Ͽ� ����� id,pw �ҷ��� ArrayList�� ����.
				int idx = read.indexOf(" ");
				ary_id.add(read.substring(0, idx));
				ary_pw.add(read.substring(idx + 1, (read.length() - 1) + 1));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
