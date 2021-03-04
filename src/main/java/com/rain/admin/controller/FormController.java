package com.rain.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/03/04 15:06
 */
@Controller
public class FormController {
    @GetMapping("form_layouts")
    public String formLayout() {
        return "form/form_layouts";
    }

    @GetMapping("form_advanced_components")
    public String formAdvancedComponents() {
        return "form/form_advanced_components";
    }

    @GetMapping("form_validation")
    public String formValidation() {
        return "form/form_validation";
    }

    @GetMapping("form_wizard")
    public String formWizard() {
        return "form/form_wizard";
    }
}
