package org.swcraft.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KillMeController {

	private CustomHealthIndicator customHealthIndicator;

	@Autowired
	public KillMeController(CustomHealthIndicator customHealthIndicator) {
		this.customHealthIndicator = customHealthIndicator;
	}

	@RequestMapping(value = "/killIt", method = RequestMethod.POST)
	public void killIt() {
		customHealthIndicator.makeItDown();
	}

}
