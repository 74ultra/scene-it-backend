package com.sceneIt.movies.media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "api/v1/media")
@RestController
public class MediaController {

    private final MediaService mediaService;

    @Autowired
    public MediaController(MediaService mediaService){
        this.mediaService = mediaService;
    }

    // GET all user media by userId - List
    @GetMapping(path = "{userid}")
    public List<Media> getMediaByUserId(@PathVariable("userid") String userid){
        return mediaService.getMediaByUserId(userid);
    }

    // GET ALL USER'S MEDIA BY USERID
    @GetMapping
    public List<Media> getAllMedia(){
        return mediaService.getAllMedia();
    }

    // GET USER'S COLLECTION NAMES BY USERID
    @GetMapping(path = "collections/{userid}")
    public List<String> getCollectionsByUserId(@PathVariable("userid") String userid){
        return mediaService.getCollectionsByUserId(userid);
    }

    // ADD NEW MEDIA FROM USER
    @RequestMapping(
            value = "add",
            produces = "application/json",
            method = RequestMethod.POST
    )
    public void addNewMedia(@RequestBody Media media){
        mediaService.addNewMedia(media);
    }

    // UPDATE USER MEDIA
    @PutMapping
    public void updateMedia(@RequestBody Media media){
        mediaService.updateMedia(media);
    }

    // DELETE media
    @DeleteMapping(path = "{id}")
    public void deleteMedia(@PathVariable Long id){
        mediaService.deleteMedia(id);
    }

}
