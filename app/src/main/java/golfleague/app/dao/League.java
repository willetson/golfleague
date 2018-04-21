package golfleague.app.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class League {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;

    protected League() {}

    public League(String name) {
        this.name = name;
    }
	
	public Long getId(){
		return this.id;
	}
	
	public void setString(Long id){
		this.id = id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setString(String name){
		this.name = name;
	}
	

    @Override
    public String toString() {
        return String.format("League[id=%d, name='%s']", id, name);
    }

}