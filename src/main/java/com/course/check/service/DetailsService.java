package com.course.check.service;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Component;

import com.course.check.model.Details;

@Component
public class DetailsService {

private int userIdCount=1;	
private List<Details> DetailList= new CopyOnWriteArrayList<>();

public Details addDetails(Details details) {
	details.setUserId(userIdCount);
	DetailList.add(details);
	DetailList.add(details);
	userIdCount++;
	return details;
	
}

public List<Details> getDetails(){
	return DetailList;
}

}
