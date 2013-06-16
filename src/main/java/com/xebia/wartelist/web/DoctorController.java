package com.xebia.wartelist.web;

import com.xebia.wartelist.domain.Doctor;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebJson(jsonObject = Doctor.class)
@Controller
@RequestMapping("/doctors")
@RooWebScaffold(path = "doctors", formBackingObject = Doctor.class)
public class DoctorController {
}
