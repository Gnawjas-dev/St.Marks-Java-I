import java.util.ArrayList;

public class ListCW {
//	Take an integer n as parameter. Return a list containing the first n numbers in the Fibonacci sequence (0, 1, 1, 2, 3, 5, 8, 13...)
	public static ArrayList<Integer> Fib(int n) {
		ArrayList<Integer> Fibonacci = new ArrayList<>();
		Fibonacci.add(0);
		Fibonacci.add(1);
		for(int i=2;i<n;i++) {
			Fibonacci.add(Fibonacci.get(i-1)+Fibonacci.get(i-2));
		}
		return Fibonacci;
	}
//	Take an integer n as parameter. Return a list containing all the factors of n. 
	public static ArrayList<Integer> Factor(int n){
		ArrayList<Integer> Factor = new ArrayList<>();
		Factor.add(1);
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				Factor.add(i);
			}
		}
		return Factor;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fib(5));
		System.out.println(Factor(60));
	}

}
