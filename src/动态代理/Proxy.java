package 动态代理;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;

public class Proxy {
	// 产生新的代理类
	public static Object newProxyInstance(Class infer,InvocationHandler h) throws Exception {
		System.out.println("Proxy.newProxyInstance"+infer+":"+h);
		Method[] methods = infer.getMethods();
		String mething = "";
		for (int i = 0; i < methods.length; i++) {
			mething += "@Override\r\t" +
	               	"public void " + methods[i].getName() + "() {"
		       +"try{ Method md="+infer.getName()+".class.getMethod(\""+methods[i].getName()+"\");"
					+ "h.invoke(this,md);}catch(Exception e){}"
					+ "\r\t}";
		}
		String src = "package 动态代理;import java.lang.reflect.Method;\n" + "public class TankTimeProxy implements " + infer.getName() + "{\n"
				+ "\t\n"+"动态代理.InvocationHandler h;" + "    public TankTimeProxy(InvocationHandler h) {\n" + "\tsuper();\n" + "\tthis.h = h;\n"
				+ "    }\n" + mething + "}\n";
		String fileName = System.getProperty("user.dir") + "/src/动态代理/TankTimeProxy.java";
		File f = new File(fileName);
		FileWriter fw = new FileWriter(f);
		fw.write(src);
		fw.flush();
		fw.close();
		// 编译程序
		// 拿到编译器
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		// 文件管理者
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
		Iterable units = fileManager.getJavaFileObjects(fileName);
		// 编译任务
		CompilationTask t = compiler.getTask(null, fileManager, null, null, null, units);
		t.call();
		fileManager.close();
		// 把类载入内存
		URL[] urls = new URL[] { new URL("file:/" + System.getProperty("user.dir") + "/src") };
		URLClassLoader url = new URLClassLoader(urls);
		Class c = url.loadClass("动态代理.TankTimeProxy");
		System.out.println(c);
		// 生成对象
		Constructor constructor = c.getConstructor(InvocationHandler.class);
		// new Tank()为构造参数
		Object m = (Object) constructor.newInstance(h);
		return m;
	}
}
