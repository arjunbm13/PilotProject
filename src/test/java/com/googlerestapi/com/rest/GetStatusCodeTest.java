package com.googlerestapi.com.rest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

public class GetStatusCodeTest {
	@BeforeClass
	public void setBaseUri() {

		RestAssured.baseURI = "https://maps.googleapis.com";
	}

	@Test
	public void testStatusCode() {

		Response res = given().param("query", "restaurants in mumbai").param("key", "AIzaSyBFuIIvLOLDN82_3HyV5rorFUeOQBfWjU4").when()
				.get("/maps/api/place/textsearch/json");

		Assert.assertEquals(res.statusCode(), 200);
	}

	@Test
	public void testStatusCodeRestAssured() {

		given().param("query", "restaurants in mumbai").param("key", "Xyz").when()
				.get("/maps/api/place/textsearch/json").then().assertThat().statusCode(200);

	}

}
