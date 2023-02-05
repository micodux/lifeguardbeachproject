package net.Beaches.project.entity;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "beaches")
public class Beach {
	// https://www.youtube.com/watch?v=Ku3gsv7_bCc (50:15-1:51:30)
	
	// @ManyToOne
	// // @GeneratedValue(strategy = GenerationType.IDENTITY)
	// @JoinColumn(name = "lifeguard_id", referencedColumnName = "lifeguardid")
	// private Lifeguard lifeguard;


	//creating the OneToMany relationship between beaches and lifeguards

	@OneToMany(mappedBy = "beach")
	private List<Lifeguard> lifeguard;
		

	// mapping the model with what columns to take the values from
	@Id
	@Column(name = "beachid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "beachname")
	private String beachname;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "county")
	private String county;
	
	@Column(name ="image")
	private String image;

	@Column(name="comments")
	private String comments;
	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}

	//declaring variables
	@Column(name = "lifebouy")
	private boolean lifebouy;
	@Column(name = "firstaid")
	private boolean firstaid;
	@Column(name = "lifeguardhut")
	private boolean lifeguardhut;
	@Column(name = "dogsallowed")
	private boolean dogsallowed;
	@Column(name = "beachinfoboard")
	private boolean beachinfoboard;
	@Column(name = "parking")
	private boolean parking;
	@Column(name = "litterbin")
	private boolean litterbin;
	@Column(name = "watersafetysigns")
	private boolean watersafetysigns;
	
	//constructor

	public Beach(String beachname, String location, String county, String image, boolean lifebouy, boolean firstaid,
			boolean lifeguardhut, boolean dogsallowed, boolean beachinfoboard, boolean parking, boolean litterbin,
			boolean watersafetysigns, String comments
			// Lifeguard lifeguardinfo1
			 ) {
		this.beachname = beachname;
		this.location = location;
		this.county = county;
		this.image = image;
		this.lifebouy = lifebouy;
		this.firstaid = firstaid;
		this.lifeguardhut = lifeguardhut;
		this.dogsallowed = dogsallowed;
		this.beachinfoboard = beachinfoboard;
		this.parking = parking;
		this.litterbin = litterbin;
		this.watersafetysigns = watersafetysigns;
		this.comments = comments;
		// this.lifeguardinfo = lifeguardinfo1;
	}


	// GETS and SETS
	public boolean isLifebouy() {
		return lifebouy;
	}

	public void setLifebouy(boolean lifebouy) {
		this.lifebouy = lifebouy;
	}

	public boolean isFirstaid() {
		return firstaid;
	}

	public void setFirstaid(boolean firstaid) {
		this.firstaid = firstaid;
	}

	public boolean isLifeguardhut() {
		return lifeguardhut;
	}

	public void setLifeguardhut(boolean lifeguardhut) {
		this.lifeguardhut = lifeguardhut;
	}

	public boolean isDogsallowed() {
		return dogsallowed;
	}

	public void setDogsallowed(boolean dogsallowed) {
		this.dogsallowed = dogsallowed;
	}

	public boolean isBeachinfoboard() {
		return beachinfoboard;
	}

	public void setBeachinfoboard(boolean beachinfoboard) {
		this.beachinfoboard = beachinfoboard;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public boolean isLitterbin() {
		return litterbin;
	}

	public void setLitterbin(boolean litterbin) {
		this.litterbin = litterbin;
	}

	public boolean isWatersafetysigns() {
		return watersafetysigns;
	}

	public void setWatersafetysigns(boolean watersafetysigns) {
		this.watersafetysigns = watersafetysigns;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBeachname() {
		return beachname;
	}

	public void setBeachname(String beachname) {
		this.beachname = beachname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Beach() {
		
	}
	
	public List<Lifeguard> getLifeguard() {
		return lifeguard;
	}
	
	public void setLifeguard(List<Lifeguard> lifeguard) {
		this.lifeguard = lifeguard;
	}

}
