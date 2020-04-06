package com.larkinds.sibers.mapper;

import com.larkinds.sibers.dto.NewsDto;
import com.larkinds.sibers.model.News;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class NewsMapper extends AbstractMapper<News, NewsDto> {

    NewsMapper() {
        super(News.class, NewsDto.class);
    }

}
