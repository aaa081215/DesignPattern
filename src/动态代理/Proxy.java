package ��̬����;

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
	// �����µĴ�����
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
		String src = "package ��̬����;import java.lang.reflect.Method;\n" + "public class TankTimeProxy implements " + infer.getName() + "{\n"
				+ "\t\n"+"��̬����.InvocationHandler h;" + "    public TankTimeProxy(InvocationHandler h) {\n" + "\tsuper();\n" + "\tthis.h = h;\n"
				+ "    }\n" + mething + "}\n";
		String fileName = System.getProperty("user.dir") + "/src/��̬����/TankTimeProxy.java";
		File f = new File(fileName);
		FileWriter fw = new FileWriter(f);
		fw.write(src);
		fw.flush();
		fw.close();
		// �������
		// �õ�������
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		// �ļ�������
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
		Iterable units = fileManager.getJavaFileObjects(fileName);
		// ��������
		CompilationTask t = compiler.getTask(null, fileManager, null, null, null, units);
		t.call();
		fileManager.close();
		// ���������ڴ�
		URL[] urls = new URL[] { new URL("file:/" + System.getProperty("user.dir") + "/src") };
		URLClassLoader url = new URLClassLoader(urls);
		Class c = url.loadClass("��̬����.TankTimeProxy");
		System.out.println(c);
		// ���ɶ���
		Constructor constructor = c.getConstructor(InvocationHandler.class);
		// new Tank()Ϊ�������
		Object m = (Object) constructor.newInstance(h);
		return m;
	}
}
