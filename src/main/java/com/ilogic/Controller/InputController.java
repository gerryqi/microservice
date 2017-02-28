package com.ilogic.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gerry on 2017/2/28.
 */
@RestController
public class InputController {
    @GetMapping("/")
    public String index() {
        return "你好,docker";
    }
}
