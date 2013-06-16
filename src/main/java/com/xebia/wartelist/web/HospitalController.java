package com.xebia.wartelist.web;

import com.xebia.wartelist.domain.Hospital;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebJson(jsonObject = Hospital.class)
@Controller
@RequestMapping("/hospitals")
@RooWebScaffold(path = "hospitals", formBackingObject = Hospital.class)
public class HospitalController {
}
