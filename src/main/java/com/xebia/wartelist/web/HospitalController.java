package com.xebia.wartelist.web;

import java.math.BigInteger;
import java.util.List;

import com.xebia.wartelist.domain.Hospital;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RooWebJson(jsonObject = Hospital.class)
@Controller
@RequestMapping("/hospitals")
@RooWebScaffold(path = "hospitals", formBackingObject = Hospital.class)
public class HospitalController {
	
}
