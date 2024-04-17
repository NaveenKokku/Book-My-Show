package com.accio.BookMyShow.Service;

import com.accio.BookMyShow.Models.Movie;
import com.accio.BookMyShow.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public String addMovie(Movie movie){
        movieRepository.save(movie);
        return "Movie Added Successfully";
    }
}
