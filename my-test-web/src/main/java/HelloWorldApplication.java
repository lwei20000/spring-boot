import org.springframework.web.bind.annotation.RequestMapping;

//import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Auther: weiliang
 * @Date: 2020/12/29 17:11
 * @Description:
 */
public class HelloWorldApplication {
	@RequestMapping(value = "/")
	public String index(){
		System.out.println("这是hello world！");
		return "index";
	}

	@RequestMapping(value = "/info/more")
	public String more(Model model){
		System.out.println("这是详情页");
		model.addAttribute("name","张三");
		return "hello";
	}
}


