package com.zico.helpDesk.comm;

import org.springframework.beans.BeanUtils;

public class Utils {
	public static <T> void copyProperties(T src, T dest) {
		BeanUtils.copyProperties(src, dest);
	}
}
