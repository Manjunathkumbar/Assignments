package patterns;

public class Assignment5 {

	public static void main(String[] args) {		
		
		int n =24;
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n; j++) {
				
				if(i==n-1 || j==0 && i>(n-1)/2 || i-j>=(n-1)/2 || i+j<=(n-1)/2 || i==0  ) {
					
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println("  ");
		}

	}

}
