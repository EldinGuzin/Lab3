package main;
import java.util.*;

public class DataStructures {
	   private List<TaskItem> tasks = new ArrayList<>();

	   public DataStructures() {
	       tasks = Arrays.asList(
	               new TaskItem(1,"Push lab code to the github", TaskStatus.TO_DO),
	               new TaskItem(2,"Prepare for the quiz", TaskStatus.IN_PROGRESS),
	               new TaskItem(3,"Go over tasks from lab2", TaskStatus.COMPLETED));
	   }

		// TODO create a method to get all objects

	   public List<TaskItem> getAll(){
		   
		   return tasks;
	   }
	   
		// TODO create a method getByStatus that will accept a Status parameter and filter the tasks with the provided status

	   public List<TaskItem> getByStatus(TaskStatus taskStatus){
		   
		   return tasks
				   .stream()
				   .filter(tasks -> tasks.getTaskStatus() == taskStatus)
				   .toList();
	   }
	   
		// TODO create a method to find tasks whose id parameter greater than or equal to 2

	   public List<TaskItem> findTaskWithIdGreaterOrEqualTo2(){
		   
		   return tasks
				   .stream()
				   .filter(tasks -> tasks.getTaskId() >= 2)
				   .toList();
				   
	   }
	   
		// TODO create a method that will, by using the forEach stream method, print to the console the description of each task
	   
	   public void printDescription() {
		   
		   for(TaskItem task: tasks) {
			   
			   System.out.println(task.getTaskDescription());
		   }
		   
	   }
	   
	}

