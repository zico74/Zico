package com.zico.helpDesk.domain.model.entity.comm.embedded;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Size;

import lombok.Data;

@Embeddable
@Data
public class CommCodeId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(length=5)
	@Size(min=5, max=5)
	private String groupCodeId;
	@Column(length=2)
	@Size(min=2, max=2)
	private String codeId;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CommCodeId other = (CommCodeId) obj;
		if (codeId == null) {
			if (other.codeId != null)
				return false;
		} else if (!codeId.equals(other.codeId))
			return false;
		if (groupCodeId == null) {
			if (other.groupCodeId != null)
				return false;
		} else if (!groupCodeId.equals(other.groupCodeId))
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeId == null) ? 0 : codeId.hashCode());
		result = prime * result + ((groupCodeId == null) ? 0 : groupCodeId.hashCode());
		return result;
	}
	
	
}
