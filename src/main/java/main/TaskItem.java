package main;
import java.util.*;

public class TaskItem {

	int taskId;
	String taskDescription;
	TaskStatus taskStatus;
	
	public TaskItem(int taskId, String taskDescription, TaskStatus taskStatus) {
		
		this.taskId = taskId;
		this.taskDescription = taskDescription;
		this.taskStatus = taskStatus;
		
		
	}
	
	public int getTaskId() {
		
		return taskId;
		
	}
	
	public String getTaskDescription() {
		
		return taskDescription;
		
	}
	
	public TaskStatus getTaskStatus(){
		
		return taskStatus;
	}
	
	
	
}
