package com.Assignment;

public class SquareRoot {

	int numb;
	public SquareRoot(int a) {
		numb = a;
	}
	 public int sqroot() {
		 int output=0;
		 while(output*output<=numb) {
			 output+=1;
		 }
		 return output-1;
	 }
}
