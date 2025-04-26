package Dsa_Java_list;

import java.util.Arrays;
import java.util.List;

public class FindMaxInList {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(12,34,5,6,7,76,89,36);
		int max=0;
		for (Integer integer : li) {
			if(max<integer)
				max=integer;
		}
		System.out.println(max);
	}

}
