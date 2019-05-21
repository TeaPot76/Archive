package com.codeclan.archive.archive.projections;


import com.codeclan.archive.archive.models.File;
import com.codeclan.archive.archive.models.Folder;
import com.codeclan.archive.archive.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedUser", types = Folder.class)
public interface EmbededUser {

    String getTitle();
    User getUser();
    File getFile();


}
