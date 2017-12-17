package com.shieldsolutions.velocity;

import org.springframework.web.servlet.config.annotation.UrlBasedViewResolverRegistration;

import com.shieldsolutions.velocity.view.VelocityViewResolver;

public class VelocityRegistration extends UrlBasedViewResolverRegistration {
	public VelocityRegistration() {
		super(new VelocityViewResolver());
		super.getViewResolver().setSuffix(".vm");
	}
}
