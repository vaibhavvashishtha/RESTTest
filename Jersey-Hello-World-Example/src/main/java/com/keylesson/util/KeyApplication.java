package com.keylesson.util;

import org.glassfish.jersey.server.ResourceConfig;

public class KeyApplication extends ResourceConfig {
	public KeyApplication() {
		packages("com.keylesson.service");
	}
}
