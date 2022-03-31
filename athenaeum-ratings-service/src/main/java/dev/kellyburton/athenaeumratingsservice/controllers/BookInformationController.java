package dev.kellyburton.athenaeumratingsservice.controllers;

import dev.kellyburton.athenaeumratingsservice.models.BookInformation;
import dev.kellyburton.athenaeumratingsservice.service.BookInfoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/bookinfo")
public class BookInformationController {
    private final BookInfoService bookInfoService;

    public BookInformationController(BookInfoService bookInfoService) {
        this.bookInfoService = bookInfoService;
    }

    @PostMapping
    public ResponseEntity addBookInfo(@RequestBody BookInformation bookInformation){
        bookInfoService.addBookInfo(bookInformation);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @PutMapping
    public ResponseEntity updateBookInfo(@RequestBody BookInformation bookInformation){
        bookInfoService.updateBookInfo(bookInformation);
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public ResponseEntity getAllBookInfo(){
        return ResponseEntity.ok(bookInfoService.getAllBookInfo());
    }

    @GetMapping("post/{id}")
    public ResponseEntity getBookInfoById(@PathVariable String id){
        return ResponseEntity.ok(bookInfoService.getBookInfoById(id));
    }

    @GetMapping("/{volumeId}")
    public ResponseEntity getBookInfoByVolumeId(@PathVariable String volumeId){
        return ResponseEntity.ok(bookInfoService.getBookInfoByBookId(volumeId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteBookInfo(@PathVariable String id){
        bookInfoService.deleteBookInfo(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
