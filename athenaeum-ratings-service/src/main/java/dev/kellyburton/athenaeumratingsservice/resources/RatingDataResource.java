package dev.kellyburton.athenaeumratingsservice.resources;

import dev.kellyburton.athenaeumratingsservice.models.BookInformation;
import dev.kellyburton.athenaeumratingsservice.models.Rating;
import dev.kellyburton.athenaeumratingsservice.models.UserBookInformation;
import dev.kellyburton.athenaeumratingsservice.models.UserRating;
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
    public UserBookInformation getBookInformation(@PathVariable("UUID") String UUID ) {
        List<BookInformation> ratings = Arrays.asList(
                new BookInformation("bWIkEAAAQBAJ", "bookshelf 1", true, "ScifiTBR", true, false, 4, Arrays.asList("Foo", "Bar") ),
                new BookInformation("AQAAAEDcyQaJyM", "", true, "ScifiTBR", true, true, 4, Arrays.asList("Foo", "bizz") )
        );
        UserBookInformation userBookInformation = new UserBookInformation();
        userBookInformation.setBookInformation(ratings);
        return userBookInformation;
    }


}
