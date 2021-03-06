package com.zinglabs.zwerewolf.config;

import java.util.HashMap;
import java.util.Map;

import com.zinglabs.zwerewolf.constant.ProtocolConstant;
import com.zinglabs.zwerewolf.controller.BaseController;
import com.zinglabs.zwerewolf.controller.impl.BusinessController;
import com.zinglabs.zwerewolf.controller.impl.GameController;
import com.zinglabs.zwerewolf.controller.impl.MessageController;
import com.zinglabs.zwerewolf.controller.impl.UserController;

public class ProcessorTable {
    private static Map<Short,BaseController> table = new HashMap<>();
    static {
       table.put(ProtocolConstant.SID_USER,new UserController());
       table.put(ProtocolConstant.SID_MSG,new MessageController());
       table.put(ProtocolConstant.SID_BNS,new BusinessController());
       table.put(ProtocolConstant.SID_GAME,new GameController());
    }
    public static BaseController get(short code){
        return table.get(code);
    }
    public static Map<Short,BaseController> getAll(){
    	return table;
    }
}
