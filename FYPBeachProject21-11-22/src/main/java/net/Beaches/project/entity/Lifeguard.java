package net.Beaches.project.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name ="lifeguard")
public class Lifeguard {
    // https://www.youtube.com/watch?v=Ku3gsv7_bCc (50:15-1:51:30)

    // @OneToMany(mappedBy = "lifeguard")
    // private List<Beach> lifeguard;
    
    //creating the relationship between beaches and lifeguards

    @ManyToOne
    @JoinColumn(name = "beach_id")
    private Beach beach;
    
    // mapping the model with what columns to take the values from
    @Id
    @Column(name = "lifeguardid", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;

   
    //declaring variables
    @Column(name = "lifeguardemail")
    private String lifeguardemail;
    @Column(name = "lifeguardfirstname")
    private String lifeguardfirstname;
    @Column(name = "lifeguardlastname")
    private String lifeguardlastname;
    @Column(name = "lifeguardqualificationlevel")
    private String lifeguardqualificationlevel;

    //constructor
    public Lifeguard(String lifeguardfirstname, String lifeguardlastname, String lifeguardqualificationlevel, String lifeguardemail) {
        this.lifeguardfirstname = lifeguardfirstname;
        this.lifeguardlastname = lifeguardlastname;
        this.lifeguardqualificationlevel = lifeguardqualificationlevel;
        this.lifeguardemail = lifeguardemail;
    }


    public Lifeguard () {}
    //Gets and sets

    public String getLifeguardfirstname() {
        return lifeguardfirstname;
    }
    public void setLifeguardfirstname(String lifeguardfirstname) {
        this.lifeguardfirstname = lifeguardfirstname;
    }
    public String getLifeguardlastname() {
        return lifeguardlastname;
    }
    public void setLifeguardlastname(String lifeguardlastname) {
        this.lifeguardlastname = lifeguardlastname;
    }
    public String getLifeguardqualificationlevel() {
        return lifeguardqualificationlevel;
    }
    public void setLifeguardqualificationlevel(String lifeguardqualificationlevel) {
        this.lifeguardqualificationlevel = lifeguardqualificationlevel;
    }
    public Long getId() {
        return id;
    }

    public String getLifeguardemail() {
        return lifeguardemail;
    }


    public void setLifeguardemail(String lifeguardemail) {
        this.lifeguardemail = lifeguardemail;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
