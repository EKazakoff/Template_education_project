package com.example.demo.controller.user;

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
class UserControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testGetUser() throws Exception {
        this.mockMvc.perform(post("/api/user/list")
                .content("{\n" +
                        "\"officeId\": 12\n" +
                        "}")
                .contentType("application/json"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk());
    }

    @Test
    public void testUpdateUser() throws Exception {
        this.mockMvc.perform(post("/api/user/update")
                .content("{\n" +
                        "  \"id\": 1,\n" +
                        "  \"firstName\": \"Elena\",\n" +
                        "  \"secondName\": \"Petrova\",\n" +
                        "  \"position\": \"Acountant\"\n" +
                        "}")
                .contentType("application/json"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk());
    }

    @Test
    public void testSaveUser() throws Exception {
        this.mockMvc.perform(post("/api/user/save")
                .content("{\n" +
                        "  \"officeId\": 12,\n" +
                        "  \"firstName\": \"Ivan\",\n" +
                        "  \"secondName\": \"Orlov\",\n" +
                        "  \"position\": \"programmer\"\n" +
                        "}")
                .contentType("application/json"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk());
    }

/*    @Test
    public void testListUser() throws Exception {
        mockMvc.perform(get("api/user/1")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "    \"data\": {\n" +
                        "        \"id\": 1,\n" +
                        "        \"firstName\": \"Максим\",\n" +
                        "        \"secondName\": \"Умнов\",\n" +
                        "        \"middleName\": \"Сергеевич\",\n" +
                        "        \"position\": \"программист\",\n" +
                        "        \"phone\": \"1234567\",\n" +
                        "        \"docName\": \"заграничный паспорт\",\n" +
                        "        \"docNumber\": 711,\n" +
                        "        \"docDate\": \"Выдан спец. отделом ОВД\",\n" +
                        "        \"citizenshipName\": \"Российская Федерация\",\n" +
                        "        \"citizenshipCode\": 643,\n" +
                        "        \"identified\": false\n" +
                        "    }\n" +
                        "}").
                andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk()));
    }*/
}