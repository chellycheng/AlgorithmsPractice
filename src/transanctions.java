class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        int num_valid = transactions.length;
        int l = num_valid;
        int check_index = 0;
        List<String> lst = new ArrayList<String>();
    while(check_index<num_valid){
        if(!check1(transactions,check_index)){
            //current is valid
            //we can use this to campare with other
            //if not, swap it with the num_valid -1 one.
            //and reduce num_valid
            String temp = transactions[check_index];
            transactions[check_index] = transactions[num_valid-1];
            transactions[num_valid-1] = temp;
            num_valid--; 
            continue;
        }
        check_index++;
        lst.add(transactions[check_index]);
        
        for(int i=num_valid-1;i>=0;i++)
        {
            if(check2(transactions, check_index, i)){
                //swap
                String temp = transactions[check_index];
                transactions[check_index] = transactions[i];
                transactions[i] = temp;
                lst.add(transactions[check_index]);
                check_index++;
            }
            else{
                num_valid--;
            }
        }
    }
        return lst;
    }
    
    public boolean check1(String[] transactions, int index){
        String transaction = transactions[index];
        String[] infor = transaction.split(",");
        String amount = infor[2];
        boolean isValid= true;
        if(Integer.valueOf(amount)>1000){
            isValid = false;
        }
        return isValid;
    }
        
    public boolean check2(String[] transactions, int index1, int index2){
            //knowing that index1 position is valid
            //checking if the index2 position is valid
        String transaction1 = transactions[index1];
        String[] infor1 = transaction1.split(",");
        String name1 = infor1[0];
        String time1 = infor1[1];
        String city1 = infor1[3];
        
        String transaction2 = transactions[index2];
        String[] infor2 = transaction2.split(",");
        String name2 = infor2[0];
        String time2 = infor2[1];
        String city2 = infor2[3];
        
        boolean isValid = true;
        if(Integer.valueOf(time2)<=(60+Integer.valueOf(time1)|Integer.valueOf(time1) -60)){
            if(name1.equals(name2)){
                if(!city1.equals(city2)){
                    isValid = false;
                }
            }
        }
        return isValid;
    }
    
    
}