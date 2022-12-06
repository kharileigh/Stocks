package com.six.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.six.entity.Share;

import com.six.service.ShareService;

@RestController
public class ShareResource {
	
	@Autowired
	private ShareService shareService;
	
	@GetMapping(path = "/shares/{sId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Share searchShareByShareIdResource(@PathVariable("sId")int shareId) {
		
		return shareService.searchShareByShareId(shareId);
	}

}
