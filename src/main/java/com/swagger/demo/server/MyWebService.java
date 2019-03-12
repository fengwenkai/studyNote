package com.swagger.demo.server;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author WenKai
 * @description
 * @create 2018-12-14 15:25
 */
@WebService
public interface MyWebService {
    int add(@WebParam(name = "firstA") int a, @WebParam(name = "firstB") int b);
    int minus(@WebParam(name = "secondA") int a, @WebParam(name = "secondB") int b);

}
