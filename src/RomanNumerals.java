import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanNumerals {
	Map<String, Integer> map = new HashMap<String, Integer>();
	
    public RomanNumerals(){
    	map.put("I", 1);
    	map.put("V", 5);
    	map.put("X", 10);
    	map.put("L", 50);
    	map.put("C", 100);
    	map.put("D", 500);
    	map.put("M", 1000);
    }
    
	public boolean isValid(String romanNum){
		
		boolean result= true;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int countv = 0;
		int countl = 0;
		int countd = 0;
		char[] roman = romanNum.toCharArray(); 
		
		for(int i=0; i<roman.length; i++){
			if(roman[i] == 'I'){
				count1++;
			}
			if(roman[i] == 'X'){
				count2++;
			}
			if(roman[i] == 'C'){
				count3++;
			}
			if(roman[i] == 'M'){
				count4++;
			}
			if(roman[i] == 'V'){
				countv++;
			}
			if(roman[i] == 'L'){
				countl++;
			}
			if(roman[i] == 'D'){
				countd++;
			}
		}
		
		if(count1>3 || count2>3 || count3>3 ||count4>3){
			result = false;
		}
		
		if(countv>1 || countl>1 || countd>1){
			result = false;
		}
		return result;
	}
	
	public int convertToInteger(String romanNum) {
		int result = 0;
		if(romanNum.length() == 1){
			result = map.get(romanNum);
		}
		
		
		return result;
		
	}
}
