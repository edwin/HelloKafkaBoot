package com.edw.hellokafka;

import com.edw.hellokafka.service.MessagingService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 *  com.edw.hellokafka.MainController
 * </pre>
 *
 * @author edwin < edwinkun at gmail dot com >
 * May 11, 2018 9:54:35 PM
 *
 */
@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    private MessagingService messagingService;
    
    @RequestMapping(value = "", method = RequestMethod.GET)
    public Map helloWorld(String param) {
        
        messagingService.send(param);
        
        System.out.println(">>> sending "+param);
        
        Map map = new HashMap();
        map.put("success", true);
        map.put("param", param);
        return map;
    }
}
