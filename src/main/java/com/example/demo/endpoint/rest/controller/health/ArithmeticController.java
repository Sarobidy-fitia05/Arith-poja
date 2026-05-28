package com.example.demo.endpoint.rest.controller.health;

import com.example.demo.PojaGenerated;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@PojaGenerated
@RestController
@AllArgsConstructor
public class ArithmeticController {

  private final AritmeticService arithService;

  public ArithmeticController() {
    this.arithService = new AritmeticService();


  @GetMapping("/add")
  public int add(
          @RequestParam int a,
          @RequestParam int b
  ) {

    return arithService.add(a, b);
  }
    @GetMapping("/subtract")
    public int add(
    @RequestParam int a,
    @RequestParam int b
  ) {

      return arithService.add(a, b);
    }

    @GetMapping("/multiply")
    public int add(
    @RequestParam int a,
    @RequestParam int b
  ) {

      return arithService.add(a, b);
    }

    @GetMapping("/divide")
    public int add(
    @RequestParam int a,
    @RequestParam int b
  ) {

      return arithService.add(a, b);
    }
}
