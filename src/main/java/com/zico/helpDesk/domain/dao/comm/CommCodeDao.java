package com.zico.helpDesk.domain.dao.comm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.zico.helpDesk.domain.model.entity.comm.CommCode;
import com.zico.helpDesk.domain.model.entity.comm.embedded.CommCodeId;
// test
public interface CommCodeDao extends JpaRepository<CommCode, CommCodeId>, QueryDslPredicateExecutor<CommCode> {
}
