package binarySearch;

import java.util.Arrays;

public class binarySearch {

	public static void main(String[] args) {
		int[] numeros = { 12, 45, 67, 27, 89, 84, 65, 21, 44 };
		int numberToSearch = 5;
		
		if (Arrays.binarySearch(numeros, numberToSearch)>0)
			  System.out.println("El número " + numberToSearch + " está en el Array");
			else 
			  System.out.println("El número " + numberToSearch + " NO está en el Array");

	}

}
