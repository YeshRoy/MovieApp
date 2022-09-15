package com.example.movie.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="booking")
@Data
public class Bookings {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ticketId;
	private int noOdMembers;
	
	
    @OneToOne
    @JoinColumn(referencedColumnName = "userID")
    private User user;
    

    @OneToOne
    @JoinColumn(referencedColumnName = "movieId")
    private MovieTime movieTime;
	
	@OneToMany
	@JoinColumn(name="ticketId")
	private List<Seat> seatsForThisBooking=new ArrayList<Seat>();
	
	
	
	

}
