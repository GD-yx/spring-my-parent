package com.controller;

import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.InputStreamSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 * @author 南八
 */
@Controller
public class FileController {

    public static final String FILE_DIRECTORY = "D:/360Downloads/yx";
    @PostMapping("/upload")
    public String upload(MultipartFile myfile){
        String filename = myfile.getOriginalFilename();
        String path = FILE_DIRECTORY + File.separator + filename;
        File file = new File(path);
        try {
            myfile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "ok";
    }


    @RequestMapping("/download")
    public ResponseEntity<InputStreamSource> download(String filename) throws IOException {
        String fullPath = FILE_DIRECTORY+File.separator+filename;
        File file = new File(fullPath);
        String mediaType = URLConnection.guessContentTypeFromName(filename);
        if(mediaType==null){
            mediaType = MediaType.APPLICATION_OCTET_STREAM_VALUE;
        }
        System.out.println("----------debug:mediaType=" + mediaType);
        HttpHeaders respHandlers = new HttpHeaders();
        respHandlers.setContentType(MediaType.parseMediaType(mediaType));

        respHandlers.setContentDispositionFormData("attachment",
                URLEncoder.encode(filename,"UTF-8"));

        InputStreamResource isr = new InputStreamResource(new FileInputStream(file));
        return new ResponseEntity<>(isr,respHandlers, HttpStatus.OK);
    }
}
