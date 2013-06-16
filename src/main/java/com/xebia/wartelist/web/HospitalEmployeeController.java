package com.xebia.wartelist.web;

import com.xebia.wartelist.domain.HospitalEmployee;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebJson(jsonObject = HospitalEmployee.class)
@Controller
@RequestMapping("/hospitalemployees")
@RooWebScaffold(path = "hospitalemployees", formBackingObject = HospitalEmployee.class)
public class HospitalEmployeeController {
}
