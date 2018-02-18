package com.iqmsoft.mvc.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:messages.properties")
public class Message {
	
	@Value("${pageHomeHeader}")
	private String homePageHeader;
	
	@Value("${pageHomeContent}")
	private String homePageContent;
	
	@Value("${pageAboutHeader}")
	private String aboutPageHeader;
	
	@Value("${pageAboutContent}")
	private String aboutPageContent;
	
	@Value("${pageHeader}")
	private String pageHeader;
	
	@Value("${h1pageHeader}")
	private String h1pageHeader;
	
	
	public String getH1pageHeader() {
		return h1pageHeader;
	}


	public void setH1pageHeader(String h1pageHeader) {
		this.h1pageHeader = h1pageHeader;
	}


	public String getPageHeader() {
		return pageHeader;
	}


	public void setPageHeader(String pageHeader) {
		this.pageHeader = pageHeader;
	}


	public Message() {}
	

	public String getHomePageHeader() {
		return homePageHeader;
	}
	public void setHomePageHeader(String homePageHeader) {
		this.homePageHeader = homePageHeader;
	}
	public String getHomePageContent() {
		return homePageContent;
	}
	public void setHomePageContent(String homePageContent) {
		this.homePageContent = homePageContent;
	}
	public String getAboutPageHeader() {
		return aboutPageHeader;
	}
	public void setAboutPageHeader(String aboutPageHeader) {
		this.aboutPageHeader = aboutPageHeader;
	}
	public String getAboutPageContent() {
		return aboutPageContent;
	}
	public void setAboutPageContent(String aboutPageContent) {
		this.aboutPageContent = aboutPageContent;
	}
}
