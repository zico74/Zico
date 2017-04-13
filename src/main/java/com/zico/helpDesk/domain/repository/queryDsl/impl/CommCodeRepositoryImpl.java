package com.zico.helpDesk.domain.repository.queryDsl.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import com.querydsl.jpa.JPQLQuery;
import com.zico.helpDesk.domain.model.entity.comm.CommCode;
import com.zico.helpDesk.domain.model.entity.comm.QCommCode;
import com.zico.helpDesk.domain.repository.queryDsl.CommCodeRepositoryQueryDsl;

public class CommCodeRepositoryImpl extends QueryDslRepositorySupport implements CommCodeRepositoryQueryDsl {

	public CommCodeRepositoryImpl() {
		super(CommCode.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Page<CommCode> findByGroupCodeIdInfo(Pageable pageable) {
		// TODO Auto-generated method stub
		QCommCode qCommCode = QCommCode.commCode;
		
		JPQLQuery<CommCode> query = from(qCommCode);
		
		query.groupBy(qCommCode.commCodeId.groupCodeId);
		
		List<CommCode> data = getQuerydsl().applyPagination(pageable, query).fetch();
		
		return new PageImpl<>(data, pageable, data.size());
	}

}
