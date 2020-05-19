package org.sci.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class SunChitSms implements Serializable
{

private static final long serialVersionUID = 1L;
private String SunstechitUrl;
private  String SunstechitKey;
private String SunstechitRouteId;
private String SunstechitType;
private String SunstechitCampaign;
private  String SunstechitSenderId;
public String getSunstechitUrl() {
	return SunstechitUrl;
}
public void setSunstechitUrl(String sunstechitUrl) {
	SunstechitUrl = sunstechitUrl;
}
public String getSunstechitKey() {
	return SunstechitKey;
}
public void setSunstechitKey(String sunstechitKey) {
	SunstechitKey = sunstechitKey;
}
public String getSunstechitRouteId() {
	return SunstechitRouteId;
}
public void setSunstechitRouteId(String sunstechitRouteId) {
	SunstechitRouteId = sunstechitRouteId;
}
public String getSunstechitType() {
	return SunstechitType;
}
public void setSunstechitType(String sunstechitType) {
	SunstechitType = sunstechitType;
}
public String getSunstechitCampaign() {
	return SunstechitCampaign;
}
public void setSunstechitCampaign(String sunstechitCampaign) {
	SunstechitCampaign = sunstechitCampaign;
}
public String getSunstechitSenderId() {
	return SunstechitSenderId;
}
public void setSunstechitSenderId(String sunstechitSenderId) {
	SunstechitSenderId = sunstechitSenderId;
}

}