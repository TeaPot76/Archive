package com.codeclan.archive.archive.repositories;

import com.codeclan.archive.archive.models.File;
import com.codeclan.archive.archive.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface FileRepository extends JpaRepository<File, Long> {
    }

