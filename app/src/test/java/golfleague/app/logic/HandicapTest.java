package golfleague.app.logic;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import golfleague.app.dao.Member;
import golfleague.app.dao.Round;
import golfleague.app.dao.Team;

public class HandicapTest {

	@Test
	public void test() {
		
		Member member = new Member("Bob", "Hope");
		Team team = new Team("Griffendor");
		member.setTeam(team);
		
		Round r1 = new Round(member, team, new Date(2,1,1),1, 0F, 40F);
		Round r2 = new Round(member, team, new Date(1,1,1),1, 0F, 36F);
		Round r3 = new Round(member, team, new Date(3,1,1),1, 0F, 40F);
		Round r4 = new Round(member, team, new Date(4,1,1),1, 0F, 40F);
		Round r5 = new Round(member, team, new Date(5,1,1),1, 0F, 41F);
		Round r6 = new Round(member, team, new Date(6,1,1),1, 0F, 41F);
		Round r7 = new Round(member, team, new Date(7,1,1),1, 0F, 41F);
		Round r8 = new Round(member, team, new Date(8,1,1),1, 0F, 41F);
		Round r9 = new Round(member, team, new Date(9,1,1),1, 0F, 41F);
		Round r10 = new Round(member, team, new Date(10,1,1),1, 0F, 41F);
		Round r11 = new Round(member, team, new Date(11,1,1),1, 0F, 29F);
		
		List<Round> rounds = new ArrayList<Round>();
		member.setRounds(rounds);
		
		
		assertEquals(Handicap.calculateMemberHandicap(member), 0F, 0.01F);
		
		rounds.add(r1);
		assertEquals(Handicap.calculateMemberHandicap(member), 4F, 0.01F);
		
		rounds.add(r2);
		assertEquals(Handicap.calculateMemberHandicap(member), 0F, 0.01F);
		
		rounds.add(r3);
		assertEquals(Handicap.calculateMemberHandicap(member), 0F, 0.01F);
		
		rounds.add(r4);
		assertEquals(Handicap.calculateMemberHandicap(member), 2F, 0.01F);
		
		rounds.add(r5);
		assertEquals(Handicap.calculateMemberHandicap(member), 2F, 0.01F);
		
		rounds.add(r6);
		assertEquals(Handicap.calculateMemberHandicap(member), 2.5F, 0.01F);
		
		rounds.add(r7);
		assertEquals(Handicap.calculateMemberHandicap(member), 2.5F, 0.01F);
		
		rounds.add(r8);
		assertEquals(Handicap.calculateMemberHandicap(member), 3.0F, 0.01F);
		
		rounds.add(r9);
		assertEquals(Handicap.calculateMemberHandicap(member), 3.0F, 0.01F);
		
		rounds.add(r10);
		assertEquals(Handicap.calculateMemberHandicap(member), 3.0F, 0.01F);
		
		rounds.add(r11);
		assertEquals(Handicap.calculateMemberHandicap(member), 2F, 0.01F);
		
	}

}
