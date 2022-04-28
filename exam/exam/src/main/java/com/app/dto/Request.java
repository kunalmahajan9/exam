package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Request {
	//"data": [â€œAâ€�,â€�1â€�,â€�334â€�,â€�4â€�,â€�Râ€�]
	
	private String[]  data;

	public Request() {
		super();
	}

	public Request(String[] data) {
		super();
		this.data = data;
	}

	public String[] getData() {
		return data;
	}

	public void setData(String[] data) {
		this.data = data;
	}
	
}
