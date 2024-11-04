package introduction;

public class firstProject {

	public static boolean less20(int n) {
		if ((n%20==19) || (n%20==18))
			return true;
		    
	  return false;
	}
	
	public static int teenSum(int a, int b) {
		  
	  if (((a >= 13) && (a <= 19)) || ((b >= 13) && (b <= 19)))
	    return 19;
	    
	  return (a + b);
	}
	public static int countCode(String str) {
	  int count = 0;
	  for (int i = 0; i <= str.length()-4; i++){
	    String firstFour = str.substring(i,i+4);
	    if ( (((firstFour.substring(0,2)).equals("co")) && ((firstFour.substring(3,4)).equals("e")))) {
	      count++;
	    }
	  }
	  return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(less20(18));
		System.out.println(less20(19));
		System.out.println(less20(20));
		System.out.println(teenSum(3,4));
		System.out.println(teenSum(10,13));
		System.out.println(teenSum(13,2));
		System.out.println(countCode("aaacodebbb"));
		System.out.println(countCode("codexxcode"));
		System.out.println(countCode("cozexxcope"));
	}

}
