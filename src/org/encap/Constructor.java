package org.encap;

public class Constructor {
	public Constructor() {
		System.out.println("i am in constructor");
		}
		public void Constructort(int a) {
		System.out.println("1 argument int");
		}
		private void Constructors(int i) {
		System.out.println(i);
		}
		public static void main(String[] args) {
			Constructor c = new Constructor();
			Constructor ant = new Constructor();
		c.Constructors(10);
		}
		}
		
