package com.zico.helpDesk.domain.repository.queryDsl.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import com.zico.helpDesk.domain.model.entity.comm.CommCode;
import com.zico.helpDesk.domain.model.entity.comm.QCommCode;
import com.zico.helpDesk.domain.repository.queryDsl.CommCodeRepositoryQueryDsl;

public class CommCodeRepositoryQueryDslImpl extends QueryDslRepositorySupport implements CommCodeRepositoryQueryDsl {

	public CommCodeRepositoryQueryDslImpl() {
		super(CommCode.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Page<CommCode> findByGroupCodeIdInfo(CommCode commCode, Pageable pagealbe) {
		// TODO Auto-generated method stub
		QCommCode qCommCode = QCommCode.commCode;
		return null;
	}

}
