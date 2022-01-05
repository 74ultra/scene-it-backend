package com.sceneIt.movies.media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaService {

    private final MediaRepository mediaRepository;

    @Autowired
    public MediaService(MediaRepository mediaRepository){
        this.mediaRepository = mediaRepository;
    }

    // GET ALL USER'S MEDIA BY USERID
    List<Media> getMediaByUserId(String userid){
        return mediaRepository.getUserMediaByUserId(userid);
    }

    // GET ALL USER'S MEDIA BY USERID
    List<Media> getAllMedia(){
        return mediaRepository.findAll();
    }

    // GET USER'S COLLECTION NAMES BY USERID
    List<String> getCollectionsByUserId(String userid){
        return mediaRepository.getCollectionsByUserId(userid);
    }

    // ADD NEW MEDIA FROM USER
    void addNewMedia(Media media){
        mediaRepository.save(media);
    }

    // DELETE USER MEDIA
    void deleteMedia(Long id){
        mediaRepository.deleteById(id);
    }

    // UPDATE USER MEDIA
    void updateMedia(Media media){
        mediaRepository.save(media);
    }


}
