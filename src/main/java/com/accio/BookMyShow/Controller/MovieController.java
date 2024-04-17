package com.accio.BookMyShow.Controller;

import com.accio.BookMyShow.Models.Movie;
import com.accio.BookMyShow.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("movie")
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping("addMovie")
    public String addMovie(@RequestBody Movie movie){
        return movieService.addMovie(movie);
    }
}
