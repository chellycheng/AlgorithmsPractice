package test;

public class MaximumTime {

	public static void main(String[] args) {
        solution("?4:5?"); //14:59
        solution("?4:??"); //14:59
        solution("?3:??"); //23:59
        solution("23:5?");
        solution("2?:22"); 
        solution("0?:??");
        solution("1?:??");
        solution("??:??");
        solution("?4:0?");
        solution("?9:4?");
        solution("23:5?");// 23:59
        solution("2?:22");// 23:22
        solution("0?:??");// 09:59
        solution("1?:??");// 19:59
        solution("?4:??");// 14:59
        solution("?3:??");// 23:59
        solution("??:??");// 23:59
        solution("?4:5?"); //14:59
        solution("?4:??"); //14:59
        solution("?3:??"); //23:59
        solution("23:5?"); //23:59
        solution("2?:22"); //23:22
        solution("0?:??"); //09:59
        solution("1?:??"); //19:59
        solution("?4:0?"); //14:09
        solution("?9:4?"); //19:49

	}
	
	public static void solution(String T) {
	    char[] times = T.toCharArray();
	    if(times[0]=='?') {
	    		if(times[1]>'3'&& times[1]!='?') {
	    			times[0]='1';
	    		}
	    		else {
	    			times[0]='2';
	    		}
	    }
	    if(times[1]=='?') {
	    		if(times[0]=='2') {
	    			times[1] = '3';
	    		}
	    		else {
	    			times[1] = '9'; 
	    		}
	    }
	    if(times[3]=='?') {
	    		times[3] = '5';
	    }
	    if(times[4]=='?') {
	    		times[4] = '9';
	    }
	    
	    System.out.println(String.valueOf(times));
	  }
	
    public static void findMax(String time){
    		char[] times = time.toCharArray();
    		if(times[0]=='?') {
    			if(times[1]>'3' && times[1]!='?') times[0] = '1';
    			else times[0] = '2';
    		}
    		if(times[1]=='?') {
    			if(times[0]!='2') times[1] = '9';
    			else times[1] ='3';
    		}
    		if(times[3]=='?') {times[3] = '5'; }
    		if(times[4]=='?') {times[4] ='9';}
    	
    		System.out.println(String.valueOf(times));
    }  

}
