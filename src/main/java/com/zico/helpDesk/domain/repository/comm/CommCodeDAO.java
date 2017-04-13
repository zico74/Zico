package com.zico.helpDesk.domain.repository.comm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.zico.helpDesk.domain.dao.comm.CommCodeRepository;
import com.zico.helpDesk.domain.model.entity.comm.CommCode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class CommCodeDAO {

	@Autowired
	private CommCodeRepository commCodeRepository;
	
	public Page<CommCode> findCommCodeList(Pageable pageable) {
		//Page<CommCode> commCodePage = this.commCodeDao.findAll(pageable);
		Page<CommCode> commCodePage = this.commCodeRepository.findAll(pageable);
		log.info("====> {}", commCodePage.toString());
		return commCodePage;
	}
}
