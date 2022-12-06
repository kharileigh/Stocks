package com.six.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.six.entity.Share;
import com.six.persistence.ShareDao;

@Service
public class ShareServiceImpl implements ShareService {
	
	@Autowired
	private ShareDao shareDao;

	@Override
	public Share searchShareByShareId(int shareId) {
		return shareDao.findById(shareId).orElse(null);
	}

	



}




