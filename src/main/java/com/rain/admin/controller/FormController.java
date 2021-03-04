package com.rain.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

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

    @PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("username") String username,
                         @RequestPart("headImg") MultipartFile[] headImgs) throws IOException {
        if (headImgs.length > 0) {
            for (MultipartFile headImg : headImgs) {
                if (!headImg.isEmpty()) {
                    String filename = headImg.getOriginalFilename();
                    headImg.transferTo(new File("C:\\" + filename));
                }
            }

        }

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
