package com.example.demo.controller.organization;

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
 * The type Organization controller test.
 */
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.ANY)
@Transactional
@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OrganizationControllerTest {

    /**
     * The Mock mvc.
     */
    @Autowired
    MockMvc mockMvc;

    /**
     * Test get organization.
     *
     * @throws Exception the exception
     */
    @Test
    public void testGetOrganization() throws Exception {
        this.mockMvc.perform(post("/api/organization/list")
                .content("{\n" +
                        "  \"name\": \"Райффайзенбанк\"\n" +
                        "}")
                .contentType("application/json"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk());
    }

    /**
     * Test update organization.
     *
     * @throws Exception the exception
     */
    @Test
    public void testUpdateOrganization() throws Exception {
        this.mockMvc.perform(post("/api/organization/update")
                .content("{\n" +
                        "  \"id\": 11,\n" +
                        "  \"name\": \"Highperformance\",\n" +
                        "  \"fullName\": \"Highperfomance Ltd\",\n" +
                        "  \"inn\": \"89797\",\n" +
                        "  \"kpp\": \"765765\",\n" +
                        "  \"address\": \"5th Ave, NY\"\n" +
                        "}")
                .contentType("application/json"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk());
    }

    /**
     * Test save organization.
     *
     * @throws Exception the exception
     */
    @Test
    public void testSaveOrganization() throws Exception {
        this.mockMvc.perform(post("/api/organization/save")
                .content("{\n" +
                        "  \"name\": \"Onemore\",\n" +
                        "  \"fullName\": \"Onemore org.\",\n" +
                        "  \"inn\": \"11155577\",\n" +
                        "  \"kpp\": \"11177755\",\n" +
                        "  \"orgId\": 11,\n" +
                        "  \"address\": \"10th Ave, NY\"\n" +
                        "}")
                .contentType("application/json"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk());
    }

    /**
     * Test list organization.
     *
     * @throws Exception the exception
     */
    @Test
    public void testListOrganization() throws Exception {
        mockMvc.perform(get("api/organization/11")
                .accept(MediaType.APPLICATION_JSON)).
                andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk());
    }
}