package com.pankaj.bean;

import java.util.List;

public class CollectionMerging {
	private List<String> subjects;

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "[subjects=" + subjects + "]";
	}
}
