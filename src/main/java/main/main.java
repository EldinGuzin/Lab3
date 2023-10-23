package main;
import java.util.*;
public class main {

	public static void main(String[] args) {
		
		
		DataStructures ds = new DataStructures();
		
		
		List<TaskItem> list = ds.getByStatus(TaskStatus.COMPLETED);
		for (TaskItem task : list) {
		    System.out.println(task.getTaskDescription());
		}


	}

}
