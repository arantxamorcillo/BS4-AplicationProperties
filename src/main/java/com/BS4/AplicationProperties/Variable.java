package com.BS4.AplicationProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Variable {

    @Value("${My.VAR2}")
    private String MyVAR2;




    public String getMyVAR2() {
        return MyVAR2;
    }

    public void setMyVAR2(String myVAR2) {
        MyVAR2 = myVAR2;
    }


}
