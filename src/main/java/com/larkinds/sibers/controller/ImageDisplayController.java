package com.larkinds.sibers.controller;

import com.larkinds.sibers.dto.ImageDto;
import com.larkinds.sibers.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/img")
public class ImageDisplayController {
    @Autowired
    private ImageService imageService;

    @GetMapping
    public void displayImage(@RequestParam("id")String imageId, HttpServletResponse response)
            throws ServletException, IOException {
        ImageDto imageDto = imageService.getImage(imageId);
        response.setContentType(imageDto.getFileType());
        response.getOutputStream().write(imageDto.getData());
        response.getOutputStream().close();
    }

}
