package com.codeclan.archive.archive.components;

import com.codeclan.archive.archive.models.File;
import com.codeclan.archive.archive.models.Folder;
import com.codeclan.archive.archive.models.User;
import com.codeclan.archive.archive.repositories.FileRepository;
import com.codeclan.archive.archive.repositories.FolderRepository;
import com.codeclan.archive.archive.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {
    @Autowired
    UserRepository userRepository;
    @Autowired
    FileRepository fileRepository;
    @Autowired
    FolderRepository folderRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {

        User jack = new User("jack");
        userRepository.save(jack);
        User john = new User("john");
        userRepository.save(john);


        Folder finance = new Folder("VAT", jack);
        folderRepository.save(finance);

        Folder general = new Folder("Bills", jack);
        folderRepository.save(general);

        File file1 = new File("Index", "html", 23, finance);
        fileRepository.save(file1);

        File file2 = new File("Index", "html", 23, finance);
        fileRepository.save(file1);


        jack.addFolder(finance);
        jack.addFolder(general);
        userRepository.save(jack);

        finance.addFile(file1);
        folderRepository.save(finance);

    }


}
