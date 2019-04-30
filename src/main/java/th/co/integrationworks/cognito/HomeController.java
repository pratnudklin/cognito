package th.co.integrationworks.cognito;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@Controller
@RequestMapping("/api/v1")
public class HomeController {


    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/callback")
    public String callback(HttpServletRequest request,Model model){
        Enumeration<String> enu= request.getHeaderNames();
        while(enu.hasMoreElements()){
            String str = enu.nextElement();
            System.out.println(str +"  " + request.getHeader(str));
        }



        model.addAttribute("name","Pratz");
        return "callback";
    }

}
