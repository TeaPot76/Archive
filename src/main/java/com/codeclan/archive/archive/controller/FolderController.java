package com.codeclan.archive.archive.controller;

import com.codeclan.archive.archive.repositories.FolderRepository;
import com.codeclan.archive.archive.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/folder")
public class FolderController {
    @Autowired
    FolderRepository folderRepository;
}
