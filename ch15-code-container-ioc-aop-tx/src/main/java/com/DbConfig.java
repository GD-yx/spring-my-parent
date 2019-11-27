package com;



/**
 * @author 南八
 */

    public class DbConfig {
       private String username;
        public String getData(){
            return username;
            //return environment.getProperty("jdbc.username");
        }
    }
