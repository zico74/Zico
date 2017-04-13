package com.zico.helpDesk.domain.repository.comm;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zico.helpDesk.domain.model.entity.comm.CommCode;
import com.zico.helpDesk.domain.model.entity.comm.embedded.CommCodeId;
import com.zico.helpDesk.domain.repository.queryDsl.CommCodeRepositoryCustom;

public interface CommCodeRepository extends JpaRepository<CommCode, CommCodeId>, CommCodeRepositoryCustom {
}
