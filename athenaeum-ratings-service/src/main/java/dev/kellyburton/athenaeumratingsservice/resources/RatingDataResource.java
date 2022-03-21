package dev.kellyburton.athenaeumratingsservice.resources;

import dev.kellyburton.athenaeumratingsservice.modles.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingDataResource {

    @RequestMapping("{bookId}")
    public Rating getRating(@PathVariable("bookId") String bookId ) {
        return new Rating(bookId, 5);
    }

}
