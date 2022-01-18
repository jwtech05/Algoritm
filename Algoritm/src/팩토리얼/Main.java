package ÆÑÅä¸®¾ó;

public class Main {
	public int PACT(int n) {
		if(n==1) return 1;
		else return n*PACT(n-1);
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		System.out.print(T.PACT(5));
	}
}
