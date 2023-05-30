package com.Assignment;

public class SimpleInterest {

		int Principal;
        int Rate;
        int Time;
        public SimpleInterest(int p, int r, int t){
        	Principal =p;
        	Rate =r;
        	Time =t;
        }
        
        public double interest() {
        	double ans = (Principal*Rate*Time)/100;
        	return ans;
        }
}
