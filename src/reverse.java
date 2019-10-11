
public class reverse {
	 public int reverse(int x) {
	        String input = String.valueOf(x);
	        String result= "";
	        for (int i=input.length()-2;i>=0;i--) {
	            char c = input.charAt(i);
	                if(c=='-')
	                {
	                    result = c+result;
	                }
	                else{
	                    result +=c;
	                }
	        }
	        int r = Integer.valueOf(result);
	 		return  r;
	        }
	 	
	 		
}
