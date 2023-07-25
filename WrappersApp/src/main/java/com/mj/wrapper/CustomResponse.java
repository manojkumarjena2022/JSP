package com.mj.wrapper;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class CustomResponse extends HttpServletResponseWrapper {
	HttpServletResponse response;
	CharArrayWriter writer;
	public CustomResponse(HttpServletResponse response) {
		super(response);
		System.out.println("CustomResponse 1-param contructor");
		this.response=response;
		writer=new CharArrayWriter();//internally creates buffer and returns its destination
	}
	@Override
	public PrintWriter getWriter() throws IOException {
		System.out.println("CustomResponse getWriter()");
		PrintWriter pw=new PrintWriter(writer);//here indirectly PrintWriter is taking buffer as destination
		return pw;
	}
	@Override
	public String toString() {
		System.out.println("CustomResponse toString()");
		return writer.toString();
	}
}
