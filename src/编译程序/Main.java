package �������;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;

import ��̬����.Moveable;
import ��̬����.Tank;

import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class Main {
public static void main(String[] args) throws Exception {
	String src="package ��̬����;\n" +
	        "public class TankTimeProxy implements Moveable{\n" +
	        "\tMoveable t;\n" +
	        "    public TankTimeProxy(Moveable t) {\n" +
	        "\tsuper();\n" +
	        "\tthis.t = t;\n" +
	        "    }\n" +
	        "    public void move() {\n" +
	        "    System.out.println(\"��ʱ��ʼ\");\n" +
	        "\tlong st=System.currentTimeMillis();\n" +
	        "\tt.move();\n" +
	        "\tSystem.out.println(\"��ʱ����\"+(System.currentTimeMillis()-st));\n" +
	        "}\n" +
	        "}\n";
	String fileName=System.getProperty("user.dir")+"/src/��̬����/TankTimeProxy.java";
	File f=new File(fileName);
	FileWriter fw=new FileWriter(f);
	fw.write(src);
	fw.flush();
	fw.close();
	//�������
		//�õ�������
		JavaCompiler compiler=ToolProvider.getSystemJavaCompiler();
	    //�ļ�������
	    StandardJavaFileManager fileManager=compiler.getStandardFileManager(null, null, null);
	    Iterable units=  fileManager.getJavaFileObjects(fileName);
	    //��������
	    CompilationTask t=compiler.getTask(null, fileManager	, null, null, null, units);
	    t.call();
	    fileManager.close();
	//���������ڴ�
	    URL[] urls=new URL[]{
	    		new URL("file:/"+System.getProperty("user.dir")+"/src")
	    };
	    URLClassLoader url=new URLClassLoader(urls);
	    Class c=url.loadClass("��̬����.TankTimeProxy");
	    System.out.println(c);
	 //���ɶ���    
	    Constructor constructor = c.getConstructor(Moveable.class);
		   //new Tank()Ϊ�������
	    Moveable m=(Moveable)  constructor.newInstance(new Tank());
	    m.move();
      //	

};
}
