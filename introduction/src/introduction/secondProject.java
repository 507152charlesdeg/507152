package introduction;

public class secondProject {

	public static boolean more20(int n) {
	  if (n % 20 != 0){
	    if ((n % 20 <= 2)) {
	      return true;
	    }
	  }
	  return false;
	}
	public static boolean twoAsOne(int a, int b, int c) {
		  // a+b=c
		  // a+c=b
		  // b+c=a
		  
		  if ((a+b==c)||(a+c==b)||(b+c==a)) {
		    return true;
		  }  
		  else {
			return false;
		  }
		}

	public static boolean inOrder(int a, int b, int c, boolean bOk) {
		  // usual: c > b > a
		  // bOk: only c > b
		  if (bOk == true && c > b){
		    return true;
		  }
		  if ((c > b) && b > a){
		    return true;
		  }
		  
		  return false;
		  
		}

	public static int sumLimit(int a, int b) {
		  int sum = a + b;
		  if ((String.valueOf(sum).length()) == (String.valueOf(a).length())){
		    return sum;
		  }
		  else{
		    return a;
		  }
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(more20(20));
		System.out.println(more20(21));
		System.out.println(more20(22));
		System.out.println(more20(23));
		System.out.println(twoAsOne(1, 2, 3));
		System.out.println(twoAsOne(3, 1, 2));
		System.out.println(twoAsOne(3, 2, 2));
		System.out.println(inOrder(1, 2, 4, false));
		System.out.println(inOrder(1, 2, 1, false));
		System.out.println(inOrder(1, 1, 2, true));
		System.out.println(sumLimit(2, 3));
		System.out.println(sumLimit(8, 3));
		System.out.println(sumLimit(8, 1));
	}

}
