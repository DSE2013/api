package com.xebia.wartelist.web;

import com.xebia.wartelist.domain.Patient;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebJson(jsonObject = Patient.class)
@Controller
@RequestMapping("/patients")
@RooWebScaffold(path = "patients", formBackingObject = Patient.class)
public class PatientController {
}
