package com.mj.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class PrintLabelTag extends TagSupport {
	public PrintLabelTag() {
		System.out.println("PrintLabelTag-0-param const");
	}
	@Override
	public int doStartTag() throws JspException {
		System.out.println("PrintLabelTag.doStartTag()");
		JspWriter jw=pageContext.getOut();
		try {
			jw.println("<h1>Prime numbers are</h1>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}
}
