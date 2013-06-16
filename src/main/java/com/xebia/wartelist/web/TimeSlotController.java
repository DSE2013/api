package com.xebia.wartelist.web;

import com.xebia.wartelist.domain.TimeSlot;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebJson(jsonObject = TimeSlot.class)
@Controller
@RequestMapping("/timeslots")
@RooWebScaffold(path = "timeslots", formBackingObject = TimeSlot.class)
public class TimeSlotController {
}
