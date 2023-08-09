package com.mj.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class DisplayTag extends TagSupport {
	private int size=20;
	private String font;
	public void setFont(String font) {
		this.font = font;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public DisplayTag() {
		System.out.println("DisplayTag 0-param const");
	}
	@Override
	public int doStartTag() throws JspException {
		System.out.println("DisplayTag.doStartTag()");
		JspWriter jwJspWriter=pageContext.getOut();
		try {
			jwJspWriter.println("<span style='font-family:"+font+";font-size:"+size+"px;'>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return EVAL_BODY_INCLUDE;
	}
	@Override
	public int doEndTag() throws JspException {
		System.out.println("DisplayTag.doEndTag()");
		JspWriter jwJspWriter=pageContext.getOut();
		try {
			jwJspWriter.println("</span>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}
}
