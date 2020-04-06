package com.larkinds.sibers.mapper;

import com.larkinds.sibers.dto.ImageDto;
import com.larkinds.sibers.model.Image;
import org.springframework.stereotype.Component;
@Component
public class ImageMapper extends AbstractMapper<Image, ImageDto> {

    ImageMapper() {
        super(Image.class, ImageDto.class);
    }

}
