package com.larkinds.sibers.service;

import com.larkinds.sibers.dto.ImageDto;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ImageService {
    /**
     * Stores image in the database
     * @param image image file
     * @return image stored
     */
    ImageDto store(MultipartFile image) throws IOException;

    /**
     * Gets image from database by field id (uuid)
     * @param fieldId field id
     * @return Image found
     */
    ImageDto getImage(String fieldId);

}
