package com.study.donghyun_backend.controller;

import com.study.donghyun_backend.entity.MyData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/data")
    public ResponseEntity<List<MyData>> getData() {
        List<MyData> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            MyData myData = new MyData("kim" + i, i);
            list.add(myData);
        }

        return ResponseEntity.ok(list);
    }
}
