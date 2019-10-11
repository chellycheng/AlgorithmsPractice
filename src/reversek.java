class Solution {
    public String reverseStr(String s, int k) {
        int k2= 0;
        int k1= 0;
        String result ="";
        int l = s.length();
        if(s==null){
            return null;
        }
        if(s.equals("")){
            return result;
        }
        
        if(l<k){
            result +=reverseHelper(s);
        }
        else if(l<2*k){
            result +=reverseHelper2(s,k);
        }
        else{
        //#for the normal case that l>2k
        for(int i=0;i<s.length();i++){
            
            if (k1<k){
            String sub ="";
            sub = s.charAt(i)+ sub;
            result += sub;
                k1++;
                k2++;
            }
            else if (k2<2*k){
                result += s.charAt(i);
                k2++;
            }
            else{
                k1 =0;
                k2 =0;
                int left_l = l-i-1;
            
                if(left_l<2*k){
                  if(left_l<k){
                 //something reverse the structure   
                  for(int j=i;j<l;j++){
                     String sub ="";
                    sub = s.charAt(i)+ sub;
                        result += sub;
                      return s;
                  }
                }
                else{
                    //something reverse the k    
                    for(int j=i;j<i+k;j++){
                    String sub ="";
                    sub = s.charAt(i)+ sub;
                    result += sub;
                }
                    for(int j=i+k;j<l;j++){
                    result += s.charAt(j);
                }
                    return result;
                }
             }
            }
            
           
            }
        }

        return result;
    }
    
    public String reverseHelper(String s){
        int l = s.length();
        String result ="";
        for (int i =0;i<l;i++){
            result = s.charAt(i)+ result;
        }
        return result;
    }
        //given length of s >k
        //reverse k and + the left
        //anysubString function? subString
        public String reverseHelper2(String s,int k){
        int l = s.length();
        String s1 = reverseHelper(s.substring(0,k));
        String s2 = s.substring(k,l);
        return s1+s2;
    }
}