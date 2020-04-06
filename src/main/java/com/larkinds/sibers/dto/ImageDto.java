package com.larkinds.sibers.dto;

import lombok.Data;

@Data
public class ImageDto {
    private String id;
    private String fileName;
    private String fileType;
    private byte[] data;
}
