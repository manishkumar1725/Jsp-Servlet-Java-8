package com.manish.stream;

public class News {
	
    int newsId; 
	String postedByUser; 
	String commentByUser; 
    String comment;
	
	public News(int newsId, String postedByUser, String commentByUser,String comment)
	{
		
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	
	//GETTERS..

	public int getNewsId() {
		return newsId;
	}

	public String getPostedByUser() {
		return postedByUser;
	}

	public String getCommentByUser() {
		return commentByUser;
	}

	public String getComment() {
		return comment;
	}
	
	//SETTERS

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}

	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser
				+ ", commentByUser=" + commentByUser + ", comment=" + comment
				+ "]";
	}
	
	
}
