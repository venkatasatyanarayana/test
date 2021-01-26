package test;

import java.util.List;

import main.IntersectingArray;

import org.junit.Assert;
import org.junit.Test;



public class TestIntersectingArray {
	
	@Test
	public void posTestFindInterctingElements(){
		int array1[] = {1,3,5,9,10};
		int array2[]={3,9,2,4,8,9,6};
		IntersectingArray intersectArray = new IntersectingArray();
		List<Integer> result = intersectArray.findInterctingElements(array1, array2);
		System.out.println("posTestFindInterctingElements result="+result);
		Assert.assertEquals(true, result.contains(3));
		Assert.assertEquals(true, result.contains(9));
		Assert.assertTrue(true);
	}
	
	@Test
	public void negTestFindInterctingElements(){
		int array1[] = {1,3,5,9,10};
		int array2[]={2,4,6,8};
		IntersectingArray intersectArray = new IntersectingArray();
		List<Integer> result = intersectArray.findInterctingElements(array1, array2);
		System.out.println("negTestFindInterctingElements result="+result);
		Assert.assertEquals(true, result.isEmpty());
		Assert.assertTrue(true);
	}

}
