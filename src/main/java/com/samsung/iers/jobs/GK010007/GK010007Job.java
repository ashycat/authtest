package com.samsung.iers.jobs.GK010007;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class GK010007Job extends QuartzJobBean{

	
	private GK010007Task task; 
	
	
	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		// TODO Auto-generated method stub
		task.excuteBatch();
	
		
	}
	
	public void setGK010007Task (GK010007Task task) {
		this.task = task;
	}
	
	
	

}
