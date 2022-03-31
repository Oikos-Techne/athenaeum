package dev.kellyburton.athenaeumratingsservice.repository;

import dev.kellyburton.athenaeumratingsservice.models.BookInformation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface BookInfoRepository extends MongoRepository<BookInformation, String> {
}
