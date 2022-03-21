package dev.kellyburton.athenaeumcatalogueservice.resources;

import dev.kellyburton.athenaeumcatalogueservice.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalogue")
public class AthenaeumCatalogResource {

    @RequestMapping("/{UUID}")
    public List<CatalogItem> getCatalog(@PathVariable("UUID") String UUID) {

        return Collections.singletonList(
                new CatalogItem("Aliens", "chest bursting fun", 5)
        );
    }
}
