package com.gn.todo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gn.todo.dto.TodoDto;

@Controller
public class TodoController {

	@PostMapping("/todo/create")
	@ResponseBody
	public Map<String,String> createTodoApi(TodoDto dto){
		Map<String,String> resultMap = new HashMap<String,String>();
		resultMap.put("res_code", "500");
		resultMap.put("res_msg", "할 일 추가 실패");
		
		
		return resultMap;
	}
}
