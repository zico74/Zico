package com.zico.helpDesk.presentation.controller.web;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zico.helpDesk.domain.model.dto.comm.CommCodeDto;
import com.zico.helpDesk.domain.model.entity.comm.CommCode;
import com.zico.helpDesk.domain.repository.comm.CommCodeRepository;
import com.zico.helpDesk.domain.service.CommCodeService;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class CommCodeController {
	@Autowired
	private CommCodeService commCodeService;
	@Autowired
	private CommCodeRepository commCodeRepository;
	
	@RequestMapping(value={"/", "/comm/commCodeListView.zico"})
	public String commCodeListView(Model model,
			@PageableDefault(direction = Direction.DESC, size = 5) Pageable pageable) {
		//Page<CommCode> commCodePage = this.commCodeRepository.findCommCodeList(pageable);
		Page<CommCode> commCodePage = this.commCodeRepository.findCommCodeList(pageable);
		
		for (CommCode code : commCodePage) {
			log.info("==> {}", code.toString());
		}
		
		model.addAttribute("commCodePage", commCodePage);
		
		return "comm/commCodeListView";
	}
	
	@RequestMapping(value="/comm/commCodeListInsert.zico", method=RequestMethod.GET)
	public String commCodeInsertView(Model model) {
		model.addAttribute("commCodeDTO", new CommCodeDto());
		return "comm/commCodeInsertView";
	}
	
	@RequestMapping(value="/comm/commCodeListInsert.zico", method=RequestMethod.POST)
	public String commCodeInsert(Model model, @ModelAttribute("commCodeDTO") CommCodeDto commCodeDto) {
		String uri = "";
		boolean isOk = this.commCodeService.commCodeListInsert(commCodeDto);

		if (isOk) {
			uri = "redirect:commCodeListView.zico";
		} else {
			uri = "comm/commCodeInsertView";
		}
		return uri;
	}
	
	@RequestMapping(value="/comm/findGroupCodeIdList.zico", method=RequestMethod.POST)
	public String findGroupCodeIdList(Model model, CommCode commCode) {
		return "";
	}
}
