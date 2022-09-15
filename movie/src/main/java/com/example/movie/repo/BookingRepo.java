package com.example.movie.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.movie.entity.Bookings;
@Repository
public interface BookingRepo extends JpaRepository<Bookings, Integer>{

}
