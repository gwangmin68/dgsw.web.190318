package kr.hs.dgsw.task_calculator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    CalcService cs;

    @GetMapping("/calc/{a}/{b}/{oper}")
    public String calc(
            @PathVariable String a,
            @PathVariable String b,
            @PathVariable String oper
    ){
        return cs.CalcResult(a, b, oper);
    }
}
