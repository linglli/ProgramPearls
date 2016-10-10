package com.ll.algorithm.sort;

import java.util.Random;

public class Sort {
	int[] elements;
	
	public Sort(int[] elements) {
		this.elements = elements;
	}
	
	public void insertSort() {
		for(int i = 1; i < elements.length; i++) {
			int temp = elements[i];
			int j = i;
			for(; j > 0 && temp < elements[j-1]; j--) {
				elements[j] = elements[j-1];
			}
			if(i != j)
				elements[j] = temp;
			
		}
	}
	
	public void quickSort1(int l, int u) {
		if(l >= u) return;
		int m = l;
		int mValue = elements[l];
		
		for(int i = l+1; i <= u; i++) {
			if(elements[i] < mValue) {
				int temp = elements[++m];
				elements[m] = elements[i];
				elements[i] = temp;
			}
		}
		swap(l, m);
		
		quickSort1(l, m - 1);
		quickSort1(m + 1, u);
	}
	
	public void quickSort2(int[] elements, int l, int u) {
		quickSort2(elements, l, l - 1);
		quickSort2(elements, l + 1, u);
	}
	
	public void quickSort3(int l, int u) {
		if(l >= u) return;
		int mValue = elements[l];
		int i = l+1, j = u;
		while(true) {
			while(i <= u && elements[i] < mValue) i++;
			while(elements[j] > mValue) j--;
			if(i >= j) break;
			int temp = elements[i];
			elements[i] = elements[j];
			elements[j] = temp;
		}
		swap(l, j);
		quickSort3(l, j - 1);
		quickSort3(j + 1, u);
	}

	public void quickSort4(int l, int u) {
		if(l >= u) return;
		int randIndex = randint(l, u);
		swap(l, randIndex);
		
		int mValue = elements[l];
		int i = l+1, j = u;
		while(true) {
			while(i <= u && elements[i] < mValue) i++;
			while(elements[j] > mValue) j--;
			if(i >= j) break;
			int temp = elements[i];
			elements[i] = elements[j];
			elements[j] = temp;
		}
		swap(l, j);
		
		quickSort4(l, l - 1);
		quickSort4(l + 1, u);
	}
	
	private int randint(int l, int u) {
		Random random = new Random();
		random.nextInt(l);
		return l;
	}
	
	private void swap(int i, int j) {
		int temp = elements[i];
		elements[i] = elements[j];
		elements[j] = temp;
	}
}
