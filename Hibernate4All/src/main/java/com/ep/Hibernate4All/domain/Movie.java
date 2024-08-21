package com.ep.Hibernate4All.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Movie
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String name;
    private String description;
    private Certification certification;

//    @Override
//    public boolean equals(Object o)
//    {
//        if (this == o)
//        {
//            return true;
//        }
//
//        if (!(o instanceof Movie))
//        {
//            return false;
//        }
//
//        Movie movie = (Movie) o;
//
//        return Objects.equals(name, movie.name);
//    }
//
//    @Override
//    public int hashCode()
//    {
//        return Objects.hashCode(name);
//    }
}
