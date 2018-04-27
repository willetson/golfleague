package golfleague.app.dao;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Schedule {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	Date date; 
	
	@ManyToOne
	Team homeTeam;
	@ManyToOne
	Team vistorTeam;
	
	String course; 
	
	
}
