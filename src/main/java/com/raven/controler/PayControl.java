package com.raven.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.raven.dao.CodeMapper;
import com.raven.dao.PayMapper;
import com.raven.pojo.Code;
import com.raven.pojo.CodeExample;
import com.raven.pojo.Pay;
import com.raven.pojo.PayExample;
import com.raven.pojo.PayExample.Criteria;
@Controller
public class PayControl {
	@Autowired
	PayMapper PayMapper;
	@Autowired
	CodeMapper codeMapper;
	@ResponseBody
	@GetMapping("/pay")
	public List<Pay> getPay() {
		PayExample payExample = new PayExample();
		Criteria createCriteria = payExample.createCriteria();
		createCriteria.andAuditpassIsNotNull();
		List<Pay> selectByExample = PayMapper.selectByExample(payExample);
		
		return selectByExample;
	}
	@ResponseBody
	@GetMapping("/code")
	public List<Code> getCode() {
		CodeExample codeExample = new CodeExample();
		com.raven.pojo.CodeExample.Criteria criteria = codeExample.createCriteria();
		criteria.andIdIsNotNull();
		List<Code> selectByExample = codeMapper.selectByExample(codeExample);
		
		return selectByExample;
	}
	
	@ResponseBody
	@GetMapping("java.txt")
	public String test() {
		return "hello";
	}
}
