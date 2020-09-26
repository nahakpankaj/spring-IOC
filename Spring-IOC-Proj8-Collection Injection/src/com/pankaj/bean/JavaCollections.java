package com.pankaj.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollections {
	List<Object> list;
	Set<Object> set;
	Map<Object, Object> map;
	Properties props;

	//Setter & Getter
	public List<Object> getList() {
		System.out.println("List Elements - "+list);
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public Set<Object> getSet() {
		System.out.println("Set Elements - "+set);
		return set;
	}

	public void setSet(Set<Object> set) {
		this.set = set;
	}

	public Map<Object, Object> getMap() {
		System.out.println("Map Elements - "+map);
		return map;
	}

	public void setMap(Map<Object, Object> map) {
		this.map = map;
	}

	public Properties getProps() {
		System.out.println("Properties Elements - "+props);
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	
}
