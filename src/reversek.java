class reversek {
    public String reverseStr(String s, int k) {
        int group = 0;
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
            while((l-group*2*k-1)>=2*k){
                String sub ="";
                for(int i=group*2*k;i<group*2*k+k;i++){
                    sub = s.charAt(i)+sub;
                }
                result +=sub;
                for(int i= group*2*k+k;i<(group+1)*2*k;i++){
                    result +=s.charAt(i);
                }
                group ++;
            }
                if(l-group*2*k-1<k){
                 //something reverse the structure   
                 String sub ="";
                for(int i=group*2*k;i<l;i++){
                    sub = s.charAt(i)+sub;
                    }
                   result+= sub;
                return result;
                }
                else{
                    //something reverse the k    
                    String sub ="";
                for(int i=group*2*k;i<group*2*k+k;i++){
                    sub = s.charAt(i)+sub;
                    }
                   result+= sub;
                  for(int i= group*2*k+k;i<l;i++){
                    result +=s.charAt(i);
                }
                    return result;
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
    