package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;
import java.net.URLEncoder;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws Exception {
		//SpringApplication.run(DemoApplication.class, args);
		Long timestamp = 1618228844084L;
		String secret = "SECd22016a925b16fa14c506bb1d4380eef1773a5b078d642cd7f2ccddcb40a9726";

		String stringToSign = timestamp + "\n" + secret;
		Mac mac = Mac.getInstance("HmacSHA256");
		mac.init(new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256"));
		byte[] signData = mac.doFinal(stringToSign.getBytes("UTF-8"));

		System.out.println(signData.toString());

		String sign = URLEncoder.encode(new String(Base64.encodeBase64(signData)),"UTF-8");
		System.out.println(sign);
	}

}
