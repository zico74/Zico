package com.zico.helpDesk.domain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zico.helpDesk.comm.Utils;
import com.zico.helpDesk.domain.model.dto.comm.CommCodeDto;
import com.zico.helpDesk.domain.model.entity.comm.CommCode;
import com.zico.helpDesk.domain.model.entity.comm.UseYn;
import com.zico.helpDesk.domain.model.entity.comm.embedded.CommCodeId;
import com.zico.helpDesk.domain.repository.comm.CommCodeRepository;
import com.zico.helpDesk.domain.service.CommCodeService;

@Service("commCodeService")
public class CommCodeServiceImpl implements CommCodeService {
	
	@Autowired
	private CommCodeRepository commCodeRepository;
	
	@Override
	@Transactional
	public boolean commCodeListInsert(CommCodeDto commCodeDto) {
		// TODO Auto-generated method stub
		int size = commCodeDto.getCodeId().size();

		String groupCodeId = commCodeDto.getGroupCodeId();
		String groupCodeNm = commCodeDto.getGroupCodeNm();
		String parentGroupCodeId = commCodeDto.getParentGroupCodeId();
		String parentCodeId = commCodeDto.getParentCodeId();
		
		CommCode commCodeFixed = new CommCode();
		
		commCodeFixed.setGroupCodeNm(groupCodeNm);
		commCodeFixed.setParentGroupCodeId(parentGroupCodeId);
		commCodeFixed.setParentCodeId(parentCodeId);

		CommCodeId commCodeIdFixed = new CommCodeId();
		
		commCodeIdFixed.setGroupCodeId(groupCodeId);
		
		for (int i = 0; i < size; i++) {
			CommCode data = new CommCode();
			CommCodeId commCodeId = new CommCodeId();
			
			Utils.copyProperties(commCodeFixed, data);
			Utils.copyProperties(commCodeIdFixed, commCodeId);
			
			commCodeId.setCodeId(commCodeDto.getCodeId().get(i).trim());
			
			data.setCommCodeId(commCodeId);
			data.setCodeNm(commCodeDto.getCodeNm().get(i).trim());
			data.setSort(commCodeDto.getSort().get(i));
			data.setUseYn(UseYn.valueOf(commCodeDto.getUseYn().get(i)));
			
			this.commCodeRepository.save(data);
		}
		
		return true;
	}
}
