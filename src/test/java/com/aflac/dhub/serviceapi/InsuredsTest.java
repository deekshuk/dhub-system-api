package com.aflac.dhub.serviceapi;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static  org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static  org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static  org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static  org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


public class InsuredsTest extends BaseTest {

    @Autowired
    private WebApplicationContext context;
    private MockMvc mockMvc;

    @Before
    public void setup(){
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testStatus() throws  Exception{
        mockMvc.perform(get("/s-insured-hub/v1/health")).andExpect(status().isOk());
    }

    @Test
    public void testGetInsuredsByGuid() throws  Exception{
        mockMvc.perform(get("/s-insured-hub/v1/insureds/ins123")).andExpect(status().isOk())
                //.andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(content().contentType("text/plain;charset=UTF-8"))
                .andExpect(content().string("Get Insureds by InsuredId!ins123"));
                //.andExpect(jsonPath("$.insuredId").value("ins123"));
    }
}
