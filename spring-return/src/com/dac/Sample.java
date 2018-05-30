package com.dac;

public class Sample {
	private String title;
	private String desc;
	
	public Sample() {
		super();
	}
	
	public Sample(String title, String desc) {
		this.title = title;
		this.desc = desc;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String sayHie() {
		return "Hello World!!";
	}
}
