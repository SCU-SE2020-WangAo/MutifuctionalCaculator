package GUI;

import java.io.PrintWriter;

import javax.swing.*;
import java.awt.*;
import  java.io.*;

public class AboutInfo  {

    static private AboutInfo About2Instance = null;

    private String name;
    private String QQ;
    private String telephone;
    private String message;

    /*
     * Initializes the instance variables. The constructor is
     * declared private so it can only be called by methods of this
     * class. This prevents other classes from creating more
     * instances.
     */
    private AboutInfo () {

        name = "马扬 王澳";
        QQ = "379051737";
        telephone = "13882571572";
        message="All rights reserved";
    }



    static public AboutInfo getSingletonInstance() {

        if (About2Instance == null) {
            About2Instance = new AboutInfo();
        }

        return About2Instance;
    }

    public String getName() {

        return name;
    }

    public String getQQ() {

        return QQ;
    }

    public String getTelephone() {

        return telephone;
    }

    public String getMessage() {

        return message;
    }
}




