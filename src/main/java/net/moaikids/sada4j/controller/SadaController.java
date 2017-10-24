package net.moaikids.sada4j.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Validated
public class SadaController {
	@RequestMapping(path = "/sada", method = { RequestMethod.GET })
	@ApiOperation(value = "sada")
	public String sada() {
		return "masashi";
	}
}
