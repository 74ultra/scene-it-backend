package com.sceneIt.movies.media;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Media {

    @Id
    @SequenceGenerator(
            name = "media_sequence",
            sequenceName = "media_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "media_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;

    @NotBlank(message = "User Id must not be empty")
    private String userid;

    // ImdbID
    @NotBlank(message = "Media Id must not be empty")
    private String imdbid;

    // collection
    @NotBlank(message = "Collection name must not be empty")
    private String collection;

    // comment
    private String comment;

    // rating
    private Double rating;

    // media title
    @NotBlank(message = "Media title must not be empty")
    private String title;

    // media category
    private String category;

    // username
    @NotBlank(message = "User name must not be empty")
    private String username;

    // year made
    private String year;

}
