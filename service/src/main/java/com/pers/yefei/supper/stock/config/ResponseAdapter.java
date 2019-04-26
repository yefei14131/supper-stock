package com.pers.yefei.supper.stock.config;

import com.alibaba.fastjson.JSONObject;
import com.pers.yefei.supper.stock.exception.ResponseCodeEnum;
import com.pers.yefei.supper.stock.exception.ServerBaseException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

@Slf4j
@Service
public class ResponseAdapter {
	private final String CONTENT_TYPE_JSON = "application/json; charset=UTF-8";
	
	private JSONObject responseJSON(int code , String message ){
		JSONObject obj = new JSONObject();
		obj.put("code", code);
		obj.put("message",message);
		
		return obj;
	}

	private JSONObject responseJSON(int code ,String message, Object msgData ){
		JSONObject obj = new JSONObject();
		obj.put("code", code);
		obj.put("message",message);
		obj.put("data",msgData);

		return obj;
	}

    private void writeData(HttpServletResponse response, JSONObject data){
        try{
            String jsonString = data.toString();
            response.setContentType(CONTENT_TYPE_JSON);
            byte[] resonseBuf = jsonString.getBytes("UTF-8");
            response.setContentLength(resonseBuf.length);
            response.getOutputStream().write(resonseBuf);

            if (log.isDebugEnabled()) log.debug(jsonString);
        } catch (Exception e) {
            log.error(e.toString(), e);
        }
    }
	
	public JSONObject success() {

        return responseJSON(ResponseCodeEnum.SUSCCESS.getCode(), ResponseCodeEnum.SUSCCESS.getReason());
	}

	public JSONObject success(String message) {
        return responseJSON(ResponseCodeEnum.SUSCCESS.getCode(), message);
	}


	public JSONObject success(Object msgData) {
        return responseJSON(ResponseCodeEnum.SUSCCESS.getCode(), ResponseCodeEnum.SUSCCESS.getReason(), msgData);
	}


	public JSONObject failure(HttpServletResponse response) {
        return responseJSON(ResponseCodeEnum.FAIL.getCode(), ResponseCodeEnum.FAIL.getReason());
	}

	public JSONObject failure(ServerBaseException ex) {

        return responseJSON(ex.getCode(), ex.getMessage());
	}

	
	public JSONObject failure( String errMsg) {
        return responseJSON(ResponseCodeEnum.FAIL.getCode(), errMsg);
	}


	public boolean sendImg(HttpServletResponse response, BufferedImage buffImg, String mimeType, String fileName, String extName){
		OutputStream out= null;
		response.setContentType(mimeType);
		response.setHeader("Content-Disposition", String.format("attachment;filename=%s.%s", fileName, extName));
		try {
			out= response.getOutputStream();
			ImageIO.write(buffImg, extName, out);
//			BufferedInputStream buffIn= new BufferedInputStream(in);
//			BufferedOutputStream buffOut= new BufferedOutputStream(out);
//			byte buff[]= new byte[4096];//申请缓冲区
//			int size= buffIn.read(buff);//初始化读取缓冲
//			while (size!= -1) {
//				buffOut.write(buff, 0, size);//输出缓冲数据
//				size= buffIn.read(buff);//继续读取数据
//			}
//			buffIn.close();//关闭输入流
//			buffOut.flush();//清空输出流
//			buffOut.close();//关闭输出流
			return true;
		} catch (IOException e) {
			log.error("直接推送图片错误", e);
			return false;
		}
	}

}
