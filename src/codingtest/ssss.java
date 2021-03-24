package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import Collection_Framework.arraylist3;

public class ssss {

	public static void main(String[] args) {
		
		String aa[] = new String[3];
		
		aa[0] = "aa";
		aa[1] = "bb";
		aa[2] = "cc";
		
		System.out.println(Arrays.toString(aa));
		
		aa[0] = "";
		aa[0] = aa[1];
		aa[1] = aa[2];
		aa[2] = "";
		System.out.println(Arrays.toString(aa));
	}

}
