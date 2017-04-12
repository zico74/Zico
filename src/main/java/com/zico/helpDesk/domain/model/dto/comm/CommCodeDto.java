package com.zico.helpDesk.domain.model.dto.comm;

import java.util.List;

import lombok.Data;

@Data
public class CommCodeDto {
	private String groupCodeId;
	private String groupCodeNm;
	private String parentGroupCodeId;
	private String parentCodeId;
	private List<String> codeId;
	private List<String> codeNm;
	private List<Integer> sort;
	private List<String> useYn;

	public CommCodeDto() {

	}

	@Override
	public String toString() {
		return "CommCodeDTO [groupCodeId=" + groupCodeId + ", groupCodeNm=" + groupCodeNm + ", parentGroupCodeId="
				+ parentGroupCodeId + ", parentCodId=" + parentCodeId + ", codeId=" + codeId + ", codeNm=" + codeNm
				+ ", sort=" + sort + ", useYn=" + useYn + "]";
	}

	public CommCodeDto(String groupCodeId, String groupCodeNm, String parentGroupCodeId, String parentCodId,
			List<String> codeId, List<String> codeNm, List<Integer> sort, List<String> useYn) {
		super();
		this.groupCodeId = groupCodeId;
		this.groupCodeNm = groupCodeNm;
		this.parentGroupCodeId = parentGroupCodeId;
		this.parentCodeId = parentCodId;
		this.codeId = codeId;
		this.codeNm = codeNm;
		this.sort = sort;
		this.useYn = useYn;
	}
}
