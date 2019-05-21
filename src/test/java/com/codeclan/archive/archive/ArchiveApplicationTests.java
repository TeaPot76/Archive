package com.codeclan.archive.archive;

import com.codeclan.archive.archive.models.File;
import com.codeclan.archive.archive.models.Folder;
import com.codeclan.archive.archive.models.User;
import com.codeclan.archive.archive.repositories.FileRepository;
import com.codeclan.archive.archive.repositories.FolderRepository;
import com.codeclan.archive.archive.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArchiveApplicationTests {
	@Autowired
	UserRepository userRepository;
	@Autowired
	FolderRepository folderRepository;
	@Autowired
	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}
	@Test
	public void createUserAndFolder(){


		User jack = new User("Jack");
		userRepository.save(jack);

		Folder folder = new Folder("Admin", jack);
		folderRepository.save(folder);

	}

	@Test
	public void addFoldersAndFiles(){

		User john = new User("John");
		userRepository.save(john);

		Folder folder = new Folder("Admin", john);
		folderRepository.save(folder);



		File file1 = new File("Index", "js", 23, folder);
		fileRepository.save(file1);

		folder.addFile(file1);
		folderRepository.save(folder);

	}
}
