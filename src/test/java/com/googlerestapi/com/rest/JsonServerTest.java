package com.googlerestapi.com.rest;

import static com.jayway.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;

public class JsonServerTest {
	@BeforeClass
	public void setBaseUri() {

		RestAssured.baseURI = "http://localhost:3000";
	}

	@Test
	public void postString() {

	    given().body ("{\"id\":\"2\","
	    	    +"\"title\":\"Hello Mumbai\","
	    	    +"\"author\":\"StaffWriter\"}")
	    	    .when ()
	    	    .contentType (ContentType.JSON)
	    	    .post ("/posts");

	}
}
