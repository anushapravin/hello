package org.encap;

public class Sample {
	
		 public Sample(){
		this(10);
		System.out.println("i am in constructor");
		}
		public Sample(int i) {
		this(23.23f);
		System.out.println("am integer constructor");
		}
		public Sample(float f) {
		System.out.println("am float constructor");
		}
		public static void main(String[] args) {
		Sample s=new Sample();
		}

}
