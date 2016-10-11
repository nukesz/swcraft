package org.swcraft.spring.boot;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

	private boolean up = true;

	@Override
	public Health health() {
		if (!up) {
			return Health.down().withDetail("Error Code", "Server is marked as down").build();
		}
		return Health.up().withDetail("system", "fully functioning").build();
	}

	public void makeItDown() {
		up = false;
	}

}
