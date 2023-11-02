package com.comento.domain;

import java.util.Date;

public class BoardVo {

	private Integer bno;
	private String title;
	private String content;
	private String writer;
	private Date reddate;
	private int viewcnt;
	public Integer getBno() {
		return bno;
	}
	public void setBno(Integer bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getReddate() {
		return reddate;
	}
	public void setReddate(Date reddate) {
		this.reddate = reddate;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}





}
