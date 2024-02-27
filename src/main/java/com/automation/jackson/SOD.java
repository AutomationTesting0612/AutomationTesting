package com.automation.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SOD {

   private static ObjectMapper MAPPER=  new ObjectMapper();
    public static void main(String[] args) throws JsonProcessingException {
       BlogPost blogPost =  new BlogPost();
       blogPost.setId(12);
       blogPost.setTitle("Test");
       blogPost.setAuthor("SOD");

       String url= "http://localhost:3000/posts";

       String json = MAPPER.writeValueAsString(blogPost);
        Response response= RestAssured.given().contentType("application/json")
                .body(json).post(url);
//        assertEquals(response.getStatusCode(),201,"HTTP Message");
    }
}
