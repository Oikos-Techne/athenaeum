package dev.kellyburton.athenaeumcatalogueservice.resources;

import dev.kellyburton.athenaeumcatalogueservice.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalogue")
public class AthenaeumCatalogResource {

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/{UUID}")
    public List<CatalogItem> getCatalog(@PathVariable("UUID") String UUID) {


        UserBookInformation bookInformation = restTemplate.getForObject("http://athenaeum-rating-service/ratingsdata/users/" +UUID, UserBookInformation.class);

        return bookInformation.getBookInformation().stream().map(bookInformation1 -> {
                    // Iterating through each book id, call book info service
                    Volume volume = restTemplate.getForObject("http://athenaeum-book-service/books/" + bookInformation1.getId(), Volume.class);
                    return new CatalogItem(volume, bookInformation1);
                })
                .collect(Collectors.toList());

    }
}
