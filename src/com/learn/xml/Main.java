package com.learn.xml;

import org.w3c.dom.Document;

import cn.com.jdls.foundation.util.FileUtil;
import cn.com.jdls.foundation.util.XmlUtil;

public class Main {
	
	public static void main(String[] args) throws Exception{
		Document doc = XmlUtil.getDocument("e:/1.xml");
		String data = FileUtil.readFile("e:/1.xml");
		System.out.println("getFirstXmlNodeName::\n"+XmlUtil.getFirstXmlNodeName(data));
		//System.out.println("getChildNodeNameList::\n"+XmlUtil.getChildNodeNameList(data,"root"));
		//System.out.println("getChildNodeStrList::\n"+XmlUtil.getChildNodeStrList(data,"root"));
		//System.out.println("getFirstElementNode::\n"+XmlUtil.getFirstElementNode(data,"root").getValueStr());
		//System.out.println("getRootChildNodeNameList::\n"+XmlUtil.getRootChildNodeNameList(data));
		//System.out.println("getRootChildNodeStrList::\n"+XmlUtil.getRootChildNodeStrList(data));
		//System.out.println("getRootChildValueStrList::\n"+XmlUtil.getRootChildValueStrList(data));
	}
	
}
