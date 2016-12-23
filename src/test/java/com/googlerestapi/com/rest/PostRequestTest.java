package com.googlerestapi.com.rest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;

public class PostRequestTest {
	@BeforeClass
	public void setBaseUri() {

		RestAssured.baseURI = "http://localhost:3000";
	}

	@Test
	public void sendPostObject() {

		Posts post = new Posts();
		post.setId("3");
		post.setTitle("Hello India");
		post.setAuthor("StaffWriter");

		given().body(post).when().contentType(ContentType.JSON).post("/posts");

	}

}
