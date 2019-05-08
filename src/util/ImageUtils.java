package util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import sun.misc.BASE64Decoder;

public class ImageUtils{
	 //base64�ַ���ת����ͼƬ
    public static boolean GenerateImage(String imgStr,String fileName) {   //���ֽ������ַ�������Base64���벢����ͼƬ
        if (imgStr == null) //ͼ������Ϊ��
            return false;        
        BASE64Decoder decoder = new BASE64Decoder();        
        try {
        	System.out.println("try try");
            //Base64����
            byte[] b = decoder.decodeBuffer(imgStr);
            for (int i = 0; i < b.length; ++i) {
                if (b[i] < 0) {//�����쳣����
                    b[i] += 256;
                }
            }            
            //����jpegͼƬ
            //String imgFilePath = "F:\\test\\test.jpg";
            String imgFilePath = "/home/resImage/"+fileName+".jpg";
            //String imgFilePath = File.separator+"resImage"+File.separator+"1.jpg";//�����ɵ�ͼƬ                    
            System.out.println(imgFilePath);
            OutputStream out = new FileOutputStream(imgFilePath);
                                             
            out.write(b);
            out.flush();
            out.close();
            return true;
        } catch (Exception e) {
        	e.printStackTrace();
            return false;
        }
    }

}
