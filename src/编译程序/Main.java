package 编译程序;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;

import 动态代理.Moveable;
import 动态代理.Tank;

import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class Main {
public static void main(String[] args) throws Exception {
	String src="package 动态代理;\n" +
	        "public class TankTimeProxy implements Moveable{\n" +
	        "\tMoveable t;\n" +
	        "    public TankTimeProxy(Moveable t) {\n" +
	        "\tsuper();\n" +
	        "\tthis.t = t;\n" +
	        "    }\n" +
	        "    public void move() {\n" +
	        "    System.out.println(\"计时开始\");\n" +
	        "\tlong st=System.currentTimeMillis();\n" +
	        "\tt.move();\n" +
	        "\tSystem.out.println(\"计时结束\"+(System.currentTimeMillis()-st));\n" +
	        "}\n" +
	        "}\n";
	String fileName=System.getProperty("user.dir")+"/src/动态代理/TankTimeProxy.java";
	File f=new File(fileName);
	FileWriter fw=new FileWriter(f);
	fw.write(src);
	fw.flush();
	fw.close();
	//编译程序
		//拿到编译器
		JavaCompiler compiler=ToolProvider.getSystemJavaCompiler();
	    //文件管理者
	    StandardJavaFileManager fileManager=compiler.getStandardFileManager(null, null, null);
	    Iterable units=  fileManager.getJavaFileObjects(fileName);
	    //编译任务
	    CompilationTask t=compiler.getTask(null, fileManager	, null, null, null, units);
	    t.call();
	    fileManager.close();
	//把类载入内存
	    URL[] urls=new URL[]{
	    		new URL("file:/"+System.getProperty("user.dir")+"/src")
	    };
	    URLClassLoader url=new URLClassLoader(urls);
	    Class c=url.loadClass("动态代理.TankTimeProxy");
	    System.out.println(c);
	 //生成对象    
	    Constructor constructor = c.getConstructor(Moveable.class);
		   //new Tank()为构造参数
	    Moveable m=(Moveable)  constructor.newInstance(new Tank());
	    m.move();
      //	

};
}
