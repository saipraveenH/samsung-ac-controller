package com.example.ac.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/smartthings")
public class SmartAppController {

	@PostMapping
	public ResponseEntity<Map<String, Object>> handleLifecycle(@RequestBody Map<String, Object> body) {
		String lifecycle = (String) body.get("lifecycle");

		if ("PING".equals(lifecycle)) {
			Map<String, Object> pingData = (Map<String, Object>) body.get("pingData");
			String challenge = (String) pingData.get("challenge");

			return ResponseEntity.ok(Map.of("statusCode", 200, "pingData", Map.of("challenge", challenge)));
		}

		// Handle other lifecycles (CONFIGURATION, INSTALL, etc.)
		return ResponseEntity.ok(Map.of("statusCode", 200));
	}
}
