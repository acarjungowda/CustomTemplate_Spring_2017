package com.geni.actions;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.geni.services.AWSInstanceManager;
import com.opensymphony.xwork2.ActionSupport;

public class AWSActions extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String stopEC2Instance() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String instanceID = request.getParameter("instanceID");
		return AWSInstanceManager.stopEC2Instance(instanceID);
	}

	public String startEC2Instance() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String instanceID = request.getParameter("instanceID");
		return AWSInstanceManager.startEC2Instance(instanceID);
	}
}