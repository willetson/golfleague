package golfleague.app.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class League {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany
    private List<Season> seasons; 

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
	
    public List<Season> getSeasons() {
		return seasons;
	}

	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}

	@Override
    public String toString() {
        return String.format("League[id=%d, name='%s']", id, name);
    }

}