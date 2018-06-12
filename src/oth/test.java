package oth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

public class test {


    public static String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // �򿪺�URL֮�������
            URLConnection conn = realUrl.openConnection();
            // ����ͨ�õ���������
            conn.setRequestProperty("Authorization", "authenticator=\"*****************\",platformID=\"******\"");
            conn.setRequestProperty("Accept", "application/json");
//map.put("Content-Type", "text/plain;charset=UTF-8");
            conn.setRequestProperty("Content-Type", "application/json");
            // ����POST�������������������
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // ��ȡURLConnection�����Ӧ�������
            out = new PrintWriter(conn.getOutputStream());
            // �����������
            out.print(param);
            // flush������Ļ���
            out.flush();
            // ����BufferedReader����������ȡURL����Ӧ
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("���� POST ��������쳣��"+e);
            e.printStackTrace();
        }
        //ʹ��finally�����ر��������������
        finally{
            try{
                if(out!=null){
                    out.close();
                }
                if(in!=null){
                    in.close();
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
        return result;
    }    


public static void main(String[] args) {
 
    System.out.println("{\"unid\":\"sssssssssss\",\"uumess\":\"���Ǹ�����\"}");
        String lts = sendPost("http://106.14.13.61:9200/question/man", 
          "{\"unid\":\"sssssssssss\",\"uumess\":\"���Ǹ�����\"}"
        		);

        System.out.println(lts);

}
}