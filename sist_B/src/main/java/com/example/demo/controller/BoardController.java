package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
	@GetMapping("/listBoard")
	public String list() {
		return "게시물 목록";
	}
	
	@GetMapping("/insertBoard")
	public String insert() {
		return "게시물 등록";
	}
}
