package com.accio.BookMyShow.Repository;

import com.accio.BookMyShow.Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
