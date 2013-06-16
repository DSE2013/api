package com.xebia.wartelist.web;

import com.xebia.wartelist.domain.Operation;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebJson(jsonObject = Operation.class)
@Controller
@RequestMapping("/operations")
@RooWebScaffold(path = "operations", formBackingObject = Operation.class)
public class OperationController {
}
