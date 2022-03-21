package dev.kellyburton.athenaeumratingsservice.resources;

import dev.kellyburton.athenaeumratingsservice.modles.Rating;
import dev.kellyburton.athenaeumratingsservice.modles.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingDataResource {

    @RequestMapping("{bookId}")
    public Rating getRating(@PathVariable("bookId") String bookId ) {
        return new Rating(bookId, 5);
    }

    @RequestMapping("users/{UUID}")
    public UserRating getUserRating(@PathVariable("UUID") String UUID ) {
        List<Rating> ratings = Arrays.asList(
                new Rating("1234", 4),
                new Rating("5678", 3)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }


}