package reflection;

import java.lang.reflect.Constructor;

public class MouseFactoryReflection {
    public Object getInstance(String className) throws Exception{
        Class cls = Class.forName(className);
        Constructor constructor = cls.getConstructor();
        return constructor;
    }

    public Object getInstanceInterface(String className) throws Exception{
        Mouse mouse = new Mouseimple1();
        mouse = new Mouseimple2();
        return mouse;
    }
}
