package org.oleg.demo.controller.demo;

import lombok.RequiredArgsConstructor;
import org.oleg.demo.database.entity.User;
import org.oleg.demo.service.UserService;
import org.oleg.demo.service.model.PageResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/demo-controller")
public class DemoController {
    private final UserService userService;
    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from secured endpoint");
    }
    @GetMapping("/getall")
    public ResponseEntity<PageResponse<User>> getAll(
            @RequestParam int pageNumber,
            @RequestParam int pageSize){
        return ResponseEntity.ok(userService.getAllSpecified(pageNumber,pageSize));
    }
}
