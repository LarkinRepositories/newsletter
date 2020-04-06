package com.larkinds.sibers.model;

import lombok.Data;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Data
@Table(name = "images")
public class Image {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    @Column(name = "file_name")
    private String fileName;
    @Column(name = "file_type")
    private String fileType;
    @Lob
    @Type(type = "org.hibernate.type.ImageType")
    private byte[] data;
//    @OneToOne (cascade = CascadeType.MERGE)
//    @JoinColumn(name = "news_id")
//    private News news;


}
