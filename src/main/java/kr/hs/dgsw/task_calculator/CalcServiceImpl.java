package kr.hs.dgsw.task_calculator;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

    @Override
    public String CalcResult(String a, String b, String oper) {
        int result = 0;
        int num_a = Integer.parseInt(a);
        int num_b = Integer.parseInt(b);
        switch (oper){
            case "plus": result = num_a + num_b;
            break;
            case "min": result = num_a - num_b;
            break;
            case "mul": result = num_a * num_b;
            break;
            case "div": result = num_a / num_b;
            break;
        }
        return Integer.toString(result);
    }
}
