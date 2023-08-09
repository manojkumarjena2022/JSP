package com.mj.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class PrimeTag extends TagSupport {
	private int n=20;

	public void setN(int n) {
		System.out.println("PrimeTag.setN()");
		this.n = n;
	}
	public PrimeTag() {
		System.out.println("PrimeTag 0-param const");
	}
	@Override
	public int doStartTag() throws JspException {
		System.out.println("PrimeTag.doStartTag()");
		JspWriter jw=pageContext.getOut();

		try {
			for (int i = 2; i <= n; i++) {
				if(isPrime(i))
					jw.println(i+"&nbsp;&nbsp;");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return SKIP_BODY;
	}
	private boolean isPrime(int num) {
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	@Override
	public int doEndTag() throws JspException {
		System.out.println("PrimeTag.doEndTag()");
		return EVAL_PAGE;
	}
}
