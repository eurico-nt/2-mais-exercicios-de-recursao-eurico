package maisRecursao;

public class recursao {
	public static int fatorial(int n) {
		if(n < 0)
			throw new IllegalArgumentException("Número inválido");
		if (n == 0)
			return 1;
		if (n == 1)
			return 1;
		else return n * fatorial(n - 1);
			
	}
	
	public static int somatorioRec(int n) {
		if(n < 0)
			throw new IllegalArgumentException("Número inválido");
		if(n==0 || n==1)
			return n;
		return n + somatorioRec(n-1);
	}
	 public static int fib(int n) {
		 if(n < 0)
			 throw new IllegalArgumentException("Numero invalido");
		 if(n == 0) 
			 return 0;
		 if(n == 1)
			 return 1;
		 else return fib(n-1) + fib(n-2);
		  }
	 
	 public static int somatorio(int k, int j){
	        if(k<0 || j<0 || k>=j) return -1;
	        if(k+1 == j) return 0;
	        return k+1 + somatorio(k+1,j);
	    }
	 public static boolean ehPalindromo(String s){
	      return ehPalindromo(s, 0, s.length()-1);
	   }
	   public static boolean ehPalindromo(String s, int i, int f){
	      boolean resp;
	      if(i < f/2){
	         resp = true;
	      }   
	      if(s.charAt(i) != s.charAt(f)){
	     	 
	          return resp = false;
	       }else {
	     	  if(i>=(s.length()-1)) return true;
	     	  resp = ehPalindromo(s,i+1,f-1);

	       } 
	       return resp;
	   }
	 
	 
	
}
