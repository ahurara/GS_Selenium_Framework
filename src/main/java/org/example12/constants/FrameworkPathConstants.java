package org.example12.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.File;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FrameworkPathConstants {

    public static final String PROJECT_PATH = System.getProperty("user.dir");

    public static final String RESOURCES_DIR = PROJECT_PATH + File.separator + "src/test/resources";


    // Path for Login Locator and Test data
    public static final String LOGIN_LOCATORS_FILE_PATH =
            RESOURCES_DIR + File.separator + "/login_resources/locators.json";

    public static final String Login_TEST_DATA_FILE_PATH =
            RESOURCES_DIR + File.separator + "/login_resources/testData.json";

//
//    // Path for sidebar Locator
//    public static final String SideBar_LOCATORS_FILE_PATH =
//            RESOURCES_DIR + File.separator + "/sidebar_resources/locators.json";
//
//    // Path for Login Locator and Test data
//    public static final String ROLEPAGE_LOCATORS_FILE_PATH =
//            RESOURCES_DIR + File.separator + "/role_page_resources/locators.json";
//
//    public static final String ROLEPAGE_TEST_DATA_FILE_PATH =
//            RESOURCES_DIR + File.separator + "/role_page_resources/testData.json";


}