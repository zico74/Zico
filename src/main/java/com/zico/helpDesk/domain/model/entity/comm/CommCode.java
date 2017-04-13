package com.zico.helpDesk.domain.model.entity.comm;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.zico.helpDesk.domain.model.entity.comm.embedded.CommCodeId;

import lombok.Data;

@Entity
@Data
public class CommCode {
	@EmbeddedId
	private CommCodeId commCodeId;
	
	@Column
	private String groupCodeNm;
	
	@Column
	private String codeNm;
	
	@Column
	private Integer sort;
	
	@Column
	private String parentGroupCodeId;
	
	@Column
	private String parentCodeId;
	
	@Column(length=1)
	@Enumerated(EnumType.STRING)
	private UseYn useYn;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date regDt;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifyDt;
	
	public CommCode() {
		super();
	}
	
	public CommCode(CommCodeId commCodeId) {
		super();
		this.commCodeId = commCodeId;
	}
	
	public CommCode(String groupCodeNm) {
		super();
		this.groupCodeNm = groupCodeNm;
	}
	
	public CommCode(CommCodeId commCodeId, String groupCodeNm, String codeNm, Integer sort, String parentGroupCodeId,
			String parentCodeId, UseYn useYn, Date regDt, Date modifyDt) {
		super();
		this.commCodeId = commCodeId;
		this.groupCodeNm = groupCodeNm;
		this.codeNm = codeNm;
		this.sort = sort;
		this.parentGroupCodeId = parentGroupCodeId;
		this.parentCodeId = parentCodeId;
		this.useYn = useYn;
		this.regDt = regDt;
		this.modifyDt = modifyDt;
	}
}
