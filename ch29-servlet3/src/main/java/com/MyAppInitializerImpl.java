package com;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

/**
 * @author 南八
 */
public class MyAppInitializerImpl implements MyAppInitializer {
    @Override
    public void dangQiDonShi(ServletContext sc) {
        ServletRegistration.Dynamic registration =
                sc.addServlet("second",new SecondServlet());
        registration.addMapping("/second");
    }
}
