package com.sopovs.moradanen.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;

import org.springframework.stereotype.Component;

@WebService(name = "fooBarPort", targetNamespace = "http://www.example.com/foobar")
@Component("fooBarService")
public class FooBarService {

    @WebMethod(operationName = "getFooBar")
    @WebResult(name = "getFooBarResponse", targetNamespace = "http://www.example.com/foobar", partName = "parameters")
    @SOAPBinding(parameterStyle = ParameterStyle.BARE)
    public FooBar getFooBar() {
        return new FooBar("foo", "bar");
    }
}
