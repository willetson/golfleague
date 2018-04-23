package golfleague.app.dao;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Round {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@OneToMany
	private Member memeber;
	@OneToMany
	private Team team;
	private Date date;
	private Integer flight;
	private Float net;
	private Float gross;
	
	protected Round()  {}
	
	
	
	public Round(Member memeber, Team team, Date date, Integer flight, Float net, Float gross) {
		super();
		this.memeber = memeber;
		this.team = team;
		this.date = date;
		this.flight = flight;
		this.net = net;
		this.gross = gross;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Member getMemeber() {
		return memeber;
	}
	public void setMemeber(Member memeber) {
		this.memeber = memeber;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getFlight() {
		return flight;
	}
	public void setFlight(Integer flight) {
		this.flight = flight;
	}
	public Float getNet() {
		return net;
	}
	public void setNet(Float net) {
		this.net = net;
	}
	public Float getGross() {
		return gross;
	}
	public void setGross(Float gross) {
		this.gross = gross;
	}

}
