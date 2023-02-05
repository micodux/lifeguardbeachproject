// package net.Beaches.project.controller;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.client.RestTemplate;

// @RestController
// public class RestWaterTemplate {
//     String uri = "https://waterlevel.ie/geojson/latest/";

//     @GetMapping(value = "/api")
//     private String getApi() {
//         RestTemplate restTemplate = new RestTemplate();
//         String result = restTemplate.getForObject(uri, String.class, null);
//         return result;
//     }
// }
