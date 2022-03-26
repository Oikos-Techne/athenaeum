package dev.kellyburton.athenaeumcatalogueservice.resources;

import dev.kellyburton.athenaeumcatalogueservice.models.Book;
import dev.kellyburton.athenaeumcatalogueservice.models.CatalogItem;
import dev.kellyburton.athenaeumcatalogueservice.models.Rating;
import dev.kellyburton.athenaeumcatalogueservice.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalogue")
public class AthenaeumCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{UUID}")
    public List<CatalogItem> getCatalog(@PathVariable("UUID") String UUID) {


        UserRating ratings = restTemplate.getForObject("http://athenaeum-rating-service/ratingsdata/users/" +UUID, UserRating.class);

        return ratings.getUserRating().stream().map(rating -> {
                    // Iterating through each book id, call book info service
                    Book book = restTemplate.getForObject("http://athenaeum-book-service/books/" + rating.getBookId(), Book.class);
                    return new CatalogItem(book.getName(), "Chestbursting fun", rating.getRating());
                })
                .collect(Collectors.toList());

    }
}
