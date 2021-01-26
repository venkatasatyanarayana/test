package main;

import java.util.ArrayList;
import java.util.List;

public class IntersectingArray {
	public List<Integer> findInterctingElements(int[] array1, int[] array2){
		List<Integer> response = new ArrayList<>();
		int[] source;
		int[] destination;
		if(array1.length>array2.length){
			source = array1;
			destination = array2;
		}else{
			source = array2;
			destination = array1;
		}
				for(int index=0;index<source.length;index++){
					for(int dindex=0;dindex<destination.length;dindex++){
						if(source[index]==destination[dindex]){
							response.add(source[index]);
						}
					}
			
			}
				return response;
	}
}
