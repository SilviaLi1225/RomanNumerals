import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanNumerals {
	Map<Character, Integer> map = new HashMap<Character, Integer>();
	
    public RomanNumerals(){
    	map.put('I', 1);
    	map.put('V', 5);
    	map.put('X', 10);
    	map.put('L', 50);
    	map.put('C', 100);
    	map.put('D', 500);
    	map.put('M', 1000);
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
		
		if(romanNum.length() >= 2){
			for(int i=roman.length-1; i< roman.length; i--){
				if(i == 0) break;
					if(map.get(roman[i]) > map.get(roman[i-1])){
						if(i>0 && map.get(roman[i]) == map.get(roman[i-1])){
							result = false;
						}
						if(roman[i] == 'V'){
							result = false;
						}else if(roman[i] == 'L'){
							result = false;
						}else if(roman[i] == 'D'){
							result = false;
						}
						else if(roman[i-1] == 'I' && (roman[i] != 'V' && roman[i] != 'X')){
							result = false;
						}else if(roman[i-1] == 'X' && (roman[i] != 'L' && roman[i] != 'C')){
							result = false;
						}else if(roman[i-1] == 'C' && (roman[i] != 'D' && roman[i] != 'M')){
							result = false;
						}
						
					
				}
				
			}
			
		}
		
		
		return result;
	}
	
	public int convertToInteger(String romanNum) {
		int result = 0;
		char[] roman = romanNum.toCharArray();
		for(int i=0; i< roman.length; i++){
			System.out.println(roman[i]);
			System.out.println(roman.length);
		}
		
		//if(isValid(romanNum) == true){			
			if(roman.length == 1){
				result = map.get(roman[0]);
				System.out.println("104");
				return result;
			}	
			if(roman.length > 1){
			for(int i = roman.length-1; i>=1; i=i-2){
				
					System.out.println("107");
					int result1 = 0;
					System.out.println(map.get(roman[i]));
					if(map.get(roman[i]) > map.get(roman[i-1])){
						System.out.println("118");
						result1 = map.get(roman[i]) - map.get(roman[i-1]);
						result = result + result1;
						System.out.println("121"+ " "+ result);
						result1 = 0;
						continue;
						
					}else{
						System.out.println("125");
						result1 = map.get(roman[i-1]) + map.get(roman[i]);
						result = result + result1;
						System.out.println("128"+" "+ result1);
						result1 = 0;						
						
					}
				}
			if(roman.length % 2 !=0){
				result = result + map.get(roman[0]);
			}
		
		}
		return result;
		
	}
}
