package com.accio.BookMyShow.Models;

import com.accio.BookMyShow.Enums.Genre;
import com.accio.BookMyShow.Enums.Language;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "movies")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;

    @Column(unique = true)
    private String title;

    private LocalDate releaseDate;
    private double rating;
    private double duration;

    @Enumerated(EnumType.STRING)
    private Genre genre;
    @Enumerated(EnumType.STRING)
    private Language language;
}
