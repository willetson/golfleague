package golfleague.app.logic;

import java.util.Comparator;

import golfleague.app.dao.Round;

public class RoundScoreComparitor implements Comparator<Round> {
	@Override
	public int compare(Round o1, Round o2) {
		// @TODO Deal with null case.
		return o1.getGross().compareTo(o2.getGross());
	}

}
