package org.grandtestauto.test.dataconstants.org.grandtestauto.distributed;


import java.io.File;
public class Distributed {

public static String PATH = System.getProperty( "TestDataRoot" )  + "" + File.separator + "org" + File.separator + "grandtestauto" + File.separator + "distributed" + File.separator;

public static final String CollatedResults1_txt = PATH + "CollatedResults1.txt";
public static final String CollatedResults2_txt = PATH + "CollatedResults2.txt";
public static final String CollatedResultsA_txt = PATH + "CollatedResultsA.txt";
public static final String TestAgent1_properties = PATH + "TestAgent1.properties";
public static final String TestAgent2_properties = PATH + "TestAgent2.properties";
public static final String TestAgent3_properties = PATH + "TestAgent3.properties";

}