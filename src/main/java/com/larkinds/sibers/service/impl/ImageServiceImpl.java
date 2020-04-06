package com.larkinds.sibers.service.impl;

import com.larkinds.sibers.dto.ImageDto;
import com.larkinds.sibers.mapper.ImageMapper;
import com.larkinds.sibers.model.Image;
import com.larkinds.sibers.repository.ImageRepository;
import com.larkinds.sibers.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Objects;

@Service
public class ImageServiceImpl implements ImageService {
    private ImageMapper imageMapper;
    private ImageRepository imageRepository;

    @Autowired
    public ImageServiceImpl(ImageMapper mapper, ImageRepository imageRepository) {
        this.imageMapper = mapper;
        this.imageRepository = imageRepository;
    }

    @Override
    public ImageDto store(MultipartFile image) throws IOException {
        String fileName = StringUtils.cleanPath(Objects.requireNonNull(image.getOriginalFilename()));
        ImageDto imgStored = new ImageDto();
        imgStored.setFileName(fileName);
        imgStored.setFileType(image.getContentType());
        imgStored.setData(image.getBytes());
        return imageMapper.toDto(imageRepository.save(imageMapper.toEntity(imgStored)));
    }

    @Override
    public ImageDto getImage(String fieldId) {
       return imageMapper.toDto(imageRepository.findById(fieldId).orElse(null));
    }
}
