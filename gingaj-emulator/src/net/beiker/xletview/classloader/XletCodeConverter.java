package net.beiker.xletview.classloader;

import javassist.CodeConverter;

/**
 *
 * @author Martin Sveden
 */
public class XletCodeConverter extends CodeConverter {

    public XletCodeConverter() {
        /*
        try {
            ClassPool tempPool = ClassPool.getDefault();
            CtClass font = tempPool.get("java.awt.Toolkit");
            CtClass singleton = tempPool.get("xjava.awt.Toolkit");
            replaceNew(font, singleton, "create");
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
         *
         */
    }
}
