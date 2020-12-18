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
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * The type User controller test.
 */
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.ANY)
@Transactional
@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerTest {

    /**
     * The Mock mvc.
     */
    @Autowired
    MockMvc mockMvc;

    /**
     * Test get user.
     *
     * @throws Exception the exception
     */
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

    /**
     * Test update user.
     *
     * @throws Exception the exception
     */
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

    /**
     * Test save user.
     *
     * @throws Exception the exception
     */
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

    /**
     * Test list user.
     *
     * @throws Exception the exception
     */
    @Test
    public void testListUser() throws Exception {
        mockMvc.perform(get("/api/user/1")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)).
                andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk());
    }
}