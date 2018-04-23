package golfleague.app.logic;

import java.util.Comparator;

import golfleague.app.dao.Round;

public class RoundDateComparator implements Comparator<Round> {

	@Override
	public int compare(Round o1, Round o2) {
		return -(o1.getDate().compareTo(o2.getDate()));
				
	}
}
