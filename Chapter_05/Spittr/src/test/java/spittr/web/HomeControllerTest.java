package spittr.web;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import spittr.web.HomeController;

public class HomeControllerTest {

  @Test
  public void testHomePage() throws Exception {
    HomeController controller = new HomeController();
    // 创建MocMvc
    MockMvc mockMvc = standaloneSetup(controller).build();
    mockMvc.perform(get("/"))//get请求
           .andExpect(view().name("home"));//预期返回的视图为home
  }

}
