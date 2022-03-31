package dev.kellyburton.athenaeumratingsservice.resources;

import dev.kellyburton.athenaeumratingsservice.models.BookInformation;
import dev.kellyburton.athenaeumratingsservice.models.UserBookInformation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingDataResource {

    @RequestMapping("users/{UUID}")
    public UserBookInformation getBookInformation(@PathVariable("UUID") String UUID ) {
        List<BookInformation> ratings = Arrays.asList(
                new BookInformation(null,"bWIkEAAAQBAJ","sssss" ,"bookshelf 1", true, "ScifiTBR", true, false, 4, Arrays.asList("Foo", "Bar") ),
                new BookInformation(null,"6OuvDAAAQBAJ","ssssss", "", true, "ScifiTBR", true, true, 4, Arrays.asList("Foo", "bizz") )
        );
        UserBookInformation userBookInformation = new UserBookInformation();
        userBookInformation.setBookInformation(ratings);
        return userBookInformation;
    }


}
