package com.example.movie.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.movie.entity.Seat;
@Repository
public interface SeatRepo extends JpaRepository<Seat, Integer> {

}
