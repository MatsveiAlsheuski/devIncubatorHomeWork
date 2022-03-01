package module2Enviroment;

import by.incubator.Main;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Module2 {
    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {
        // System.out.println("Hello from jar!");
        URLClassLoader loader = new URLClassLoader(new URL[]{new URL("file://D:/Bitbucket/devIncubator/JARarchive/out/example.jar")});
        Class<?> clazz = loader.loadClass("by.incubator.Main");
        try {
            Main instance =(Main) clazz.newInstance();
            instance.main(args);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
