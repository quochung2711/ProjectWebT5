package pj.webt5.service;

import java.util.List;

import pj.webt5.model.ContentModel;

public interface ContentService {
	void insert(ContentModel content);
	
	void delete(int id);
	
	void update(ContentModel content);
	
	ContentModel getbyid(int id);
	int getTotalContent();
	List<ContentModel> getallbyid(int id); 
	
	List<ContentModel> search(String keyword);
	
	List<ContentModel> search(int id, String title);
	
}
