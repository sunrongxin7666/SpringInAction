package spittr.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //声明这是一个控制器 基于@Component
@RequestMapping("/")//对应的路径
public class HomeController {

  @RequestMapping(method = GET)
  public String home(Model model) {
    return "home"; //返回的视图 名为Home
  }

}
