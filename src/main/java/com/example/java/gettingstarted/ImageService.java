package com.example.java.gettingstarted;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

	
	public void uploadFile(MultipartFile file);
}
