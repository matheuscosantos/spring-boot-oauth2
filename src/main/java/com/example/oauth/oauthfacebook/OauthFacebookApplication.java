package com.example.oauth.oauthfacebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.core.annotation.AuthenticationPrincipal;

@SpringBootApplication
@EnableOAuth2Sso
public class OauthFacebookApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthFacebookApplication.class, args);
	}

}
