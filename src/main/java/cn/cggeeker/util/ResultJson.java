package cn.cggeeker.util;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @Author CGgeeker
 * @Description //TODO 自定义的Json实体类，方便统一前台与后端进行数据交互时统一格式
 * @Date 13:57 2019/4/25
 * @Param
 * @return
 */

public class ResultJson {
    //定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();
    //响应业务状态
    private Integer status; //规定200：请求成功 -1:请求失败 500：程序异常
    //响应消息
    private String message;  //返回后端的消息给前台
    //响应的数据
    private Object data;  //返回后端数据给前台

    public ResultJson(){}

    public ResultJson(Integer status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public static ObjectMapper getMAPPER() {
        return MAPPER;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
