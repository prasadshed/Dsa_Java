package dsa_List;

import java.util.Arrays;
import java.util.List;

public class FindMinList {

	public static void main(String[] args) {
	
			List<Integer> li=Arrays.asList(12,34,5,6,7,76,89,36);
			int min=li.get(0);
			for (Integer integer : li) {
				if(min>integer)
					min=integer;
			}
			System.out.println(min);
		
	}

}
