package jdbc_framework;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@Controller
public class MainController {

        
        
           @Autowired    
            EProductDAO eproductDAO;    
           @RequestMapping(value = "/listProducts", method = RequestMethod.GET)
            public String listProducts(ModelMap map)
            {
                    List<EProduct> list= eproductDAO.getProducts();
                model.addAttribute("list",list);  
                return "listProducts";
            }
           }

