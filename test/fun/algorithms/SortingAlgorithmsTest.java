package fun.algorithms;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SortingAlgorithmsTest {

	private List<Integer> listToBeSorted;
	
	@Before
	public void doBeforeTest(){
		listToBeSorted = new ArrayList<Integer>();
		listToBeSorted.add(5);
		listToBeSorted.add(1);
		listToBeSorted.add(4);
		listToBeSorted.add(2);
		listToBeSorted.add(3);
	}
	
	
	@Test
	public void shouldSortListInDescendingOrder(){
		SortingAlgorithm sortingAlgorithm = new QuickSort();
		
		List<Integer> sortedList = sortingAlgorithm.sort(listToBeSorted);
		List<Integer> expectedList = new ArrayList<Integer>();
		expectedList.add(5);
		expectedList.add(4);
		expectedList.add(3);
		expectedList.add(2);
		expectedList.add(1);
		assertTrue("The sorting algorithm should have sorted the list as expected:" + 
				expectedList + ", actual: " +  sortedList, expectedList.equals(sortedList));
		
	}



}
