package golfleague.app.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Team {
	 @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    
    @ManyToOne
    private Member captain;
    
    @OneToMany
    private List<Member> memeber; 
    
    protected Team() {}

	public Team(String name) {
		super();
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Member getCaptain() {
		return captain;
	}

	public void setCaptain(Member captain) {
		this.captain = captain;
	}

	public List<Member> getMemeber() {
		return memeber;
	}

	public void setMemeber(List<Member> memeber) {
		this.memeber = memeber;
	}

}
