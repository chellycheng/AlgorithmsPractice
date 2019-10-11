public class isPalindrome {
	    public boolean isPalindrome(int x) {
        boolean result = true;
        String a = ""+x;
        int l = a.length();
        int index = l-1;
        for(int i=0; i<l/2;i++){
            if(a.charAt(i)!=a.charAt(index)){
                result = false;
            }
            index--;
        }
        return result;
    }
}