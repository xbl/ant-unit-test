package com.xbl.demo.part;

import java.util.HashMap;
import java.util.Map;

public class HelloWorld1 {

    public String getStatusName1(int status) {
        String statusName = "";
        switch(status) {
            case 0:
                statusName = "未支付";
                break;
            case 1:
                statusName = "已支付";
                break;
            case '2':
                statusName = "已发货";
                break;
            case '3':
                statusName = "已签收";
                break;
            default:
                statusName = "未找到";
        }
        return statusName;
    }

    private final static Map<Integer, String> STATUS_NAME_MAP = new HashMap<>(){{
        put(0, "未支付");
        put(1, "已支付");
        put(2, "已发货");
        put(3, "已签收");
    }};

    private final static String NOT_FOUND_STATUS = "未找到";

    public String getStatusName(int status) {
        String statusName = NOT_FOUND_STATUS;
        String name = STATUS_NAME_MAP.get(status);
        if (!isEmpty(name))
            statusName = name;
        return statusName;
    }

    private boolean isEmpty(String name) {
        return "".equals(name) || null == name;
    }
}
