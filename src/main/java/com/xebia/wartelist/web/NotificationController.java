package com.xebia.wartelist.web;

import com.xebia.wartelist.domain.Notification;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebJson(jsonObject = Notification.class)
@Controller
@RequestMapping("/notifications")
@RooWebScaffold(path = "notifications", formBackingObject = Notification.class)
public class NotificationController {
}
