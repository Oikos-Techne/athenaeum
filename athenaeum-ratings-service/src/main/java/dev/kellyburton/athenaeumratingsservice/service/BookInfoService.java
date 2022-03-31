package dev.kellyburton.athenaeumratingsservice.service;

import dev.kellyburton.athenaeumratingsservice.models.BookInformation;
import dev.kellyburton.athenaeumratingsservice.repository.BookInfoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookInfoService {
    private final BookInfoRepository bookInfoRepository;

    public BookInfoService(BookInfoRepository bookInfoRepository) {
        this.bookInfoRepository = bookInfoRepository;
    }

    public void addBookInfo(BookInformation bookInformation){
        bookInfoRepository.insert(bookInformation);
    }
    public void updateBookInfo(BookInformation bookInformation){
        BookInformation updatedBookInfo = bookInfoRepository.findById(bookInformation.getId())
                .orElseThrow(() -> new RuntimeException(
                        String.format("Cannot Find Expense by ID %s" , bookInformation.getId())
                ));
        updatedBookInfo.setLocation(bookInformation.getLocation());
        updatedBookInfo.setOwned(bookInformation.isOwned());
        updatedBookInfo.setTBR(bookInformation.getTBR());
        updatedBookInfo.setWishlist(bookInformation.isWishlist());
        updatedBookInfo.setWishlist(bookInformation.isWishlist());
        updatedBookInfo.setRating(bookInformation.getRating());
        updatedBookInfo.setTags(bookInformation.getTags());

        bookInfoRepository.save(updatedBookInfo);
    }
    public List<BookInformation> getAllBookInfo(){
        return bookInfoRepository.findAll();
    }

    public void getBookInfoByName(){}

    public void deleteBookInfo(String id){
        bookInfoRepository.deleteById(id);
    }

    public Object getBookInfoById(String id) {
       return bookInfoRepository.findById(id);
    }
}
