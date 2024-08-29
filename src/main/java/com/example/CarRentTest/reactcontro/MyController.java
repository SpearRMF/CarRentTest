package com.example.CarRentTest.reactcontro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carrent")
public class MyController {
    
	@GetMapping("/test_api")
    public String testApi() {
        return "API連接成功";
    }

    // 你可以在这里添加更多的API
}
