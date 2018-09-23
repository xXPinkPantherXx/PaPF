package de.xxpinkpantherxx.papf.main;

import de.xxpinkpantherxx.papf.ApplicationHelper;

public class Main {

    private final static String MAINE_MESSAGE_KEY = "main.main";
    
    public static void main(String[] args) {
//        ApplicationHelper.init();
        final String output = ApplicationHelper.getMessage(MAINE_MESSAGE_KEY);
        System.out.println(output);
    }
}
