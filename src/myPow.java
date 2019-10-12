public double myPow(double x, int n) {
        double result = 1;
        if(x==1){
            return 1 ;
        }
        if(n==0){
            return 1;
        }
        else if (n==1){
            return x;
        }
        else if(n==-1){
            return 1/x;
        }
        else if(n>1){
            if(n%2!=0){
                result = myPow(x,n/2);
                result = result*result*x;
            }
            else{
                result = myPow(x,n/2);
                result = result*result;
            }
        }
        else{
            //n<0
            if(n%2!=0){
                result = myPow(x,n/2);
                result = result*result*1/x;
            }
            else{
                result = myPow(x,n/2);
                result = result*result;
            };
        }
        return result;
    }