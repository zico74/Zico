package com.zico.helpDesk.presentation.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.zico.helpDesk.domain.repository.comm.CommCodeRepository;
import com.zico.helpDesk.domain.service.CommCodeService;

@RestController
public class CommCodeRestController {
	@Autowired
	private CommCodeService commCodeService;
	@Autowired
	private CommCodeRepository commCodeRepository;
}
