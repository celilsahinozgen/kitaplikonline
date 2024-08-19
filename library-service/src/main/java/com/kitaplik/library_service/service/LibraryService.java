package com.kitaplik.library_service.service;


import com.kitaplik.library_service.dto.LibraryDto;
import com.kitaplik.library_service.exception.LibraryNotFoundException;
import com.kitaplik.library_service.model.Library;
import com.kitaplik.library_service.repository.LibraryRepository;
import org.apache.tomcat.jni.LibraryNotFoundError;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {

    private final LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }


    public LibraryDto getAllBooksInLibraryById(String id) {
        Library library = libraryRepository.findById(id)
                .orElseThrow(() -> new LibraryNotFoundException(" Library could not found by id " + id));


        LibraryDto libraryDto = new LibraryDto()
        return
    }

}
