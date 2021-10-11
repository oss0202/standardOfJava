package reflection;

import java.lang.reflect.Constructor;

public class MouseFactoryReflection {
    public static Object getInstance(String className) throws Exception{
        Class cls = Class.forName(className);
        Constructor constructor = cls.getConstructor();
        return constructor.newInstance();
    }

    public Object getInstanceInterface(String className) throws Exception{
//        Mouse mouse = new Mouseimple1();
//        mouse = new Mouseimple2();
//        return mouse;
        Class cls = Class.forName(className);
        Mouse mouse = (Mouse) cls.newInstance();
//        mouse.getM
        return mouse;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(getInstance("reflection.MouseFactoryReflection").getClass());
    }
}
