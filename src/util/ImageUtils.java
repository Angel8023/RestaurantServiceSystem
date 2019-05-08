package util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import sun.misc.BASE64Decoder;

public class ImageUtils{
	 //base64字符串转化成图片
    public static boolean GenerateImage(String imgStr,String fileName) {   //对字节数组字符串进行Base64解码并生成图片
        if (imgStr == null) //图像数据为空
            return false;        
        BASE64Decoder decoder = new BASE64Decoder();        
        try {
        	System.out.println("try try");
            //Base64解码
            byte[] b = decoder.decodeBuffer(imgStr);
            for (int i = 0; i < b.length; ++i) {
                if (b[i] < 0) {//调整异常数据
                    b[i] += 256;
                }
            }            
            //生成jpeg图片
            //String imgFilePath = "F:\\test\\test.jpg";
            String imgFilePath = "/home/resImage/"+fileName+".jpg";
            //String imgFilePath = File.separator+"resImage"+File.separator+"1.jpg";//新生成的图片                    
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
