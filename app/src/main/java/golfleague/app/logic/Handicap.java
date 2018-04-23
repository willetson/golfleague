package golfleague.app.logic;

import java.util.ArrayList;
import java.util.List;

import golfleague.app.dao.Member;
import golfleague.app.dao.Round;

public class Handicap {
	
	public static float calculateMemberHandicap(Member member) {
		float result = 0;
		List<Round> rounds = member.getRounds();
		
		rounds.sort(new RoundDateComparator());
		
		
		List<Round> lastTen = new ArrayList<Round>();
		int count = rounds.size()>10?10:rounds.size();
		for(int index = 0; index< count; index++) {
			lastTen.add(rounds.get(index));
		}
		
		lastTen.sort(new RoundScoreComparitor());
		int use =  0;
		switch(count) {
         case 0:
        	 use = 0;
             break;
         case 1:  
         case 2:  
         case 3:
        	 use  = 1;
        	 break;
         case 4:  
         case 5:
        	 use = 2;
        	 break;
         case 6:  
         case 7:
        	 use = 3;
        	 break;
         case 8:  
         case 9:
        	 use = 4;
        	 break;
         case 10: 
        	 use = 5;
        	 break;
		}
		
		float grossTotal = 0; 
		for(int index =0; index < use; index++){
			grossTotal += lastTen.get(index).getGross().floatValue();
		}
		
		result = (float) (((grossTotal - (36*use))/use) * .96);  
		
		result = roundHandicap(result);
		
		
		return result;
	}
	
	public static float roundHandicap(float score){
		
		float result = 0;
		int whole = (int)score;
		float fraction = score - whole;

		if(fraction < 0.3) result = whole;
		
		else if(fraction > 0.3 && fraction < 0.7) result = (float) (((float)whole) + 0.5);
		
		else if(fraction > 0.7) result = whole+1;
		
		return result;

	}
}
