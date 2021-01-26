package main;

import java.util.ArrayList;
import java.util.List;

public class IntersectingArray {
	public List<Integer> findInterctingElements(int[] array1, int[] array2){
		List<Integer> result = new ArrayList<>();
		int[] source;
		int[] destination;
		if(array1.length>array2.length){
			source = array1;
			destination = array2;
		}else{
			source = array2;
			destination = array1;
		}
		int sourceSize = source.length;
		int destSize = destination.length;
				for(int index=0;index<sourceSize;index++){
					for(int dindex=0;dindex<destSize;dindex++){
						if(source[index]==destination[dindex]){
							result.add(source[index]);
						}
					}
			
			}
				return result;
	}
}
