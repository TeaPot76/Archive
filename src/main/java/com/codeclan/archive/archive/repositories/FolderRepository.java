package com.codeclan.archive.archive.repositories;

import com.codeclan.archive.archive.models.File;
import com.codeclan.archive.archive.models.Folder;
import com.codeclan.archive.archive.projections.EmbededUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(excerptProjection = EmbededUser.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
    }

