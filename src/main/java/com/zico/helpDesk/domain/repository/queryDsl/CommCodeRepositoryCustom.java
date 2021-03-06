package com.zico.helpDesk.domain.repository.queryDsl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.zico.helpDesk.domain.model.entity.comm.CommCode;

public interface CommCodeRepositoryCustom {
	Page<CommCode> findByGroupCodeIdInfo(Pageable pageable);
}
