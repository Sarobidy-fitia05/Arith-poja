package com.example.demo.endpoint.rest.controller.health;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ArithmeticController.class)
class ArithmeticControllerWebTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void add_should_return_sum() throws Exception {

        mockMvc.perform(get("/add")
                        .param("a", "5")
                        .param("b", "10"))
                .andExpect(status().isOk())
                .andExpect(content().string("15"));
    }

    @Test
    void subtract_should_return_difference() throws Exception {

        mockMvc.perform(get("/subtract")
                        .param("a", "10")
                        .param("b", "4"))
                .andExpect(status().isOk())
                .andExpect(content().string("6"));
    }

    @Test
    void multiply_should_return_product() throws Exception {

        mockMvc.perform(get("/multiply")
                        .param("a", "5")
                        .param("b", "4"))
                .andExpect(status().isOk())
                .andExpect(content().string("20"));
    }

    @Test
    void divide_should_return_quotient() throws Exception {

        mockMvc.perform(get("/divide")
                        .param("a", "20")
                        .param("b", "4"))
                .andExpect(status().isOk())
                .andExpect(content().string("5"));
    }

    @Test
    void divide_by_zero_should_throw_exception() throws Exception {

        mockMvc.perform(get("/divide")
                        .param("a", "10")
                        .param("b", "0"))
                .andExpect(status().is4xxClientError());
    }
}