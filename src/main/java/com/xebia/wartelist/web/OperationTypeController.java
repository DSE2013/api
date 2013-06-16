package com.xebia.wartelist.web;

import com.xebia.wartelist.domain.OperationType;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebJson(jsonObject = OperationType.class)
@Controller
@RequestMapping("/operation_types")
@RooWebScaffold(path = "operationtypes", formBackingObject = OperationType.class)
public class OperationTypeController {
}
