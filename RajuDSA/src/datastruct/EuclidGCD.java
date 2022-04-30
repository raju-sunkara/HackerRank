package datastruct;

public class EuclidGCD {
	
	public int findGCD(int m, int n) {
		
		if (n==0) return(0);
		int r=m%n;
		if(r==0) {
			return n;
		}
		else {
			return findGCD(n,r);
		}
		
	}
}
