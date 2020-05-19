package org.sci.service;

import org.sci.model.SunChitSms;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import org.springframework.web.client.RestTemplate;

@Service
public class SMSEmailService {
	
	public void SendSunChitSms(String toPhoneNum, String msgText) {
		
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("SMSConfig.xml");
		SunChitSms sms = (SunChitSms) ctx.getBean("smsconfig");

		try {
			String Key = sms.getSunstechitKey();
			String campaignId = sms.getSunstechitCampaign();
			String routeId = sms.getSunstechitRouteId();
			String type = sms.getSunstechitType();
			String sender = sms.getSunstechitSenderId();
			String uriAddress = sms.getSunstechitUrl();
			RestTemplate restTemp = new RestTemplate();
			HttpHeaders headers = new HttpHeaders();
			headers.add("Content-Type", "application/x-www-form-urlencoded");
			MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
			map.add("key", Key);
			map.add("campaign", campaignId);
			map.add("routeid", routeId);
			map.add("type", type);
			map.add("contacts", toPhoneNum);
			map.add("senderid", sender);
			map.add("msg", msgText);
			HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(
					map, headers);
			ResponseEntity<String> response = restTemp.postForEntity(
					uriAddress, request, String.class);
			System.out
					.println("Response received from sms.sms.sunstechit.com while sending SMS to {0} is : {1}"
							+ toPhoneNum);
			System.out.println(response);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
