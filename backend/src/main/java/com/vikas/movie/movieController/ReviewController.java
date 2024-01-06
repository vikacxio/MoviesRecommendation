package com.vikas.movie.movieController;


import java.util.*;

import com.vikas.movie.model.Reviews;
import com.vikas.movie.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/reviews")
@CrossOrigin(origins = "http://localhost:3000")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;
    @PostMapping
    public ResponseEntity<Reviews> createReview(@RequestBody Map<String,String> payload){
        return new ResponseEntity<>(reviewService.createReview(payload.get("reviewBody"),payload.get("imdbId")), HttpStatus.CREATED);
    }
}
