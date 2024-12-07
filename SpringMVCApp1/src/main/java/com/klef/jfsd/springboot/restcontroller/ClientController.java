package com.klef.jfsd.springboot.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
  @RequestMapping(path="/",method=RequestMethod.GET)
  public String demo() {
    return "hi spring boot ";
  }
  @GetMapping(path="/demo1")
  public String demo1() {
    return "hi spring boot demo1";
  }
  @GetMapping(path="demo2")
  public String demo2() {
    return "hi spring boot demo2";
  }
  @GetMapping(path="demo3")
  public int demo3() {
    return 8688136;
  }
  @GetMapping("demo4")
  //http://localhost:8080/demo?id=111
  public String demo4 (@RequestParam("id") int eid) {
	  return "id="+eid;
  }
  @GetMapping("add")
  //http://localhost:8080/add?x=10&y=20
  public String add (@RequestParam("x")int a,@RequestParam("y")int b ){
  int c=a+b;
  return Integer.toString(c);
  }
  
  @GetMapping("name")
  //http://localhost:8080/name?fname=eshu&lname=gotha
  public String name (@RequestParam("fname")String a,@RequestParam("lname")String b ){
  String c=a+" "+b;
  return c;
  }
  @GetMapping("sub/{x}/{y}")
  //http://localhost:8080/sub/5/2
  public String sub (@PathVariable("x")int a,@PathVariable("y")int b ){
  int c=a-b;
  return Integer.toString(c);
  }
  
  @GetMapping("vname/{fname}/{lname}")
  //http://localhost:8080/vname/eshu/gotha  
  public String vname(@PathVariable("fname")String a,@PathVariable("lname")String b) {
    String c=a+" "+b;
    return c;
  }
  

}