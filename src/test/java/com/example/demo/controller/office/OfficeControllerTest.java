package com.example.demo.controller.office;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.http.MediaType;

import javax.transaction.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.ANY)
@Transactional
@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class OfficeControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testGetOffice() throws Exception {
        this.mockMvc.perform(post("/api/office/list")
                .content("{\n" +
                        "  \"orgId\": 11\n" +
                        "}")
                .contentType("application/json"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk());
    }

    @Test
    public void testUpdateOffice() throws Exception {
        this.mockMvc.perform(post("/api/office/update")
                .content("{\n" +
                        "  \"id\": 12,\n" +
                        "  \"name\": \"Westoffice\",\n" +
                        "  \"address\": \"Bond street, 57\",\n" +
                        "  \"orgId\": 11\n" +
                        "}")
                .contentType("application/json"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk());
    }

    @Test
    public void testSaveOffice() throws Exception {
        this.mockMvc.perform(post("/api/office/save")
                .content("{\n" +
                        "  \"name\": \"Southoffice\",\n" +
                        "  \"address\": \"Baker str. 104\",\n" +
                        "  \"orgId\": 11\n" +
                        "}")
                .contentType("application/json"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk());
    }

/*   @Test
    public void testListOffice() throws Exception {
        mockMvc.perform(get("api/office/12")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "    \"data\": {\n" +
                        "        \"id\": 12,\n" +
                        "        \"name\": \"Западный\",\n" +
                        "        \"address\": \"ул.Живописная, 19, Москва\",\n" +
                        "        \"phone\": \"84957211234\",\n" +
                        "        \"active\": true\n" +
                        "    }\n" +
                        "}").
                andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk()));
    }*/
}