package com.shollyb.goodreads.services;

import com.shollyb.goodreads.controllers.requestsAndResponses.BookItemUploadRequest;
import com.shollyb.goodreads.exceptions.GoodReadsException;
import com.shollyb.goodreads.models.Book;
import com.shollyb.goodreads.models.Credentials;

import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public interface BookService {
    CompletableFuture<Map<String, Credentials>> generateUploadURLs(String fileExtension, String imageExtension) throws ExecutionException, InterruptedException;
    Book save(BookItemUploadRequest bookItemUploadRequest);
    Book findBookByTitle(String title);
    Map<String, String> generateDownloadUrls(String fileName, String imageFileName) throws GoodReadsException;
    Map<String, Object> findAll(int pageNumber, int noOfItems);
}
