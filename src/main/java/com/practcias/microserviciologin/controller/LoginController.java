/*package com.practcias.microserviciologin.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "saludos")

public class LoginController {
	private final AtomicLong contador = new AtomicLong();
	private static final String template = "hola %s";

	@GetMapping
	public Saludos saludos(@RequestParam(value = "name", defaultValue = "mundo") String name) {
		return new Saludos(contador.incrementAndGet(), String.format(template, name));
	}

}*/