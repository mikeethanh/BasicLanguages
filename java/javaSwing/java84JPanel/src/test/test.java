package test;

import module.CounterModel;
import view.CounterView;

public class test {
	public static void main(String[] args) {
		CounterModel ct = new CounterModel();
		ct.increment();
		System.out.println(ct);
		
		CounterView ctv = new CounterView(); 
	}
}
