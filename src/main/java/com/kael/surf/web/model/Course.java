package com.kael.surf.web.model;

import java.util.List;

public class Course {

	private int id;
	private String title;
	private String imgPath;
	private int learningNum;
	private int level;
	private String levelDesc;
	private int duration;//minutes;
	private String decsr;
	private List<Chapter> chapterList;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public int getLearningNum() {
		return learningNum;
	}
	public void setLearningNum(int learningNum) {
		this.learningNum = learningNum;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getLevelDesc() {
		return levelDesc;
	}
	public void setLevelDesc(String levelDesc) {
		this.levelDesc = levelDesc;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getDecsr() {
		return decsr;
	}
	public void setDecsr(String decsr) {
		this.decsr = decsr;
	}
	public List<Chapter> getChapterList() {
		return chapterList;
	}
	public void setChapterList(List<Chapter> chapterList) {
		this.chapterList = chapterList;
	}
	
}
