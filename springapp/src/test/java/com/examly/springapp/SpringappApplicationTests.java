package com.examly.springapp;

import org.springframework.http.MediaType;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringappApplication.class)
@AutoConfigureMockMvc
class SpringappApplicationTests {
    @Autowired
    private MockMvc mockMvc;

    // policy usermodel add testcase
    @Test
    void test_case1() throws Exception {
        String st = "{\"userId\":\"01\",\"email\":\"demo@iamneo.ai\",\"password\":\"demo123\",\"username\":\"examlydemo\",\"mobileNumber\":\"8880999888\",\"userRole\":\"admin\"}";
        mockMvc.perform(MockMvcRequestBuilders.post("/add")
                .contentType(MediaType.APPLICATION_JSON)
                .content(st)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
    }

    @Test
    void test_case2() throws Exception {
        mockMvc.perform(get("/list")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray())
                .andReturn();
    }

    // Get by userid
    @Test
    void test_case3() throws Exception {

        mockMvc.perform(get("/list/01")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    // delete user
    @Test
    void test_case4() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/remove/01")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    // add Policy
    @Test
    void test_case5() throws Exception {
        String st = "{\"policyId\":\"01\",\"policytype\":\"Lifepolicy\",\"applicantName\":\"demo123\",\"applicantAddress\":\"Hopes\",\"applicantMobile\":\"8880999888\",\"applicantEmail\":\"demo@iamneo.ai\",\"applicantAadhaar\":\"1000001\",\"applicantPan\":\"3381lG\",\"applicantSalary\":\"100000\"}";
        mockMvc.perform(MockMvcRequestBuilders.post("/addPolicy")
                .contentType(MediaType.APPLICATION_JSON)
                .content(st)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                // .andExpect(jsonPath("$").value(true))
                .andReturn();
    }

    // get all policy
    @Test
    void test_case6() throws Exception {
        mockMvc.perform(get("/getPolicy")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray())
                .andReturn();
    }

    // get by id policy
    @Test
    void test_case7() throws Exception {

        mockMvc.perform(get("/getPolicy/01")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    // add adminpolicy
    @Test
    void test_case8() throws Exception {
        String st = "{\"policyid\":1001,\"policyname\":\"Lifepolicy\",\"applicableage\":\"demo123\",\"claimamt\":100000,\"yearsPlan\":2,\"rateofinterest\":\"8880999888\",\"policydetails\":\"demo@iamneo.ai\",\"termsandcondition\":\"terms and condition\"}";
        mockMvc.perform(MockMvcRequestBuilders.post("/admin/addPolicy")
                .contentType(MediaType.APPLICATION_JSON)
                .content(st)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
    }

}