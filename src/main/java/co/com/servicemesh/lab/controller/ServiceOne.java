package co.com.servicemesh.lab.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ServiceOne {
  @RequestMapping(
      value = "/serviceone",
      method = {RequestMethod.GET},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  public HashMap<String, String> helloServiceOne() {
    HashMap<String, String> map = new HashMap<>();
    map.put("message", "This is hello from service one - v2");
    return map;
  }
}
