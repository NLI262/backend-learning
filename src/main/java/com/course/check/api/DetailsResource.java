package com.course.check.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.course.check.model.Details;
import com.course.check.service.DetailsService;

@RestController
@RequestMapping (value="/details")
public class DetailsResource {
	@Autowired
    private DetailsService detailsService;
	
	@PostMapping
	public Details addDetails(@RequestBody Details details) {
		return detailsService.addDetails(details);
	}
}
