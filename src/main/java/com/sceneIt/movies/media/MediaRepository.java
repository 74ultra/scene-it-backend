package com.sceneIt.movies.media;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MediaRepository extends JpaRepository<Media, Long> {

    // GET ALL USER'S MEDIA BY USERID
    @Query(
            value = "SELECT * FROM media WHERE userid=:userid",
            nativeQuery = true
    )
    List<Media> getUserMediaByUserId(String userid);

    // GET USER'S COLLECTION NAMES BY USERID
    @Query(
            value = "SELECT DISTINCT(collection) FROM media WHERE userid=:userid",
            nativeQuery = true
    )
    List<String> getCollectionsByUserId(String userid);

//    // UPDATE USER MEDIA
//    @Query(
//            value = "UPDATE media SET rating=:rating, comment=:comment WHERE id=:id",
//            nativeQuery = true
//    )
//    void updateUserMedia(Long id, Double rating, String comment);
}
