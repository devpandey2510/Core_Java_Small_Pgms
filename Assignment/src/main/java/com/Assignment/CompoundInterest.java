package com.Assignment;
import java.lang.Math;

public class CompoundInterest {
	int Principal;
    int Rate;
    int Time;
    public CompoundInterest(int p, int r, int t){
    	Principal =p;
    	Rate =r;
    	Time =t;
    }
    
    public double interest() {
    	double p= Math.pow((1+(Rate/100)),Time);
    	System.out.println(p);
    	double ans = (Principal*p );
    	return ans;
    }
}
