package com.celcom.day10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Task Management System Use Case
//Add a new task
//View all tasks
//Mark a task as completed
//Delete a task
//Search for tasks

class Task {
	private String taskName;
	boolean done;

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

}

class Features {
	Scanner sc = new Scanner(System.in);
	Task task = new Task();
	static Map<String, Boolean> ListOfTasks = new HashMap<>();

	void addNewTask() {
		System.out.println("Please Enter the Task name ");
		ListOfTasks.put(sc.next(), task.done);
		System.out.println("Task added successfully :)");

	}

	void viewAllTasks() {
		ListOfTasks.forEach((key, value) -> {
			System.out.print(key + " ");
			if (value == false) {
				System.out.println("Status : Not Completed");
			} else {
				System.out.println("Status : Completed");
			}
		});
	}

	void markAsComplete() {
		System.out.println("Please Enter the Task name to mark as complete");
		String task = sc.next();
		if (ListOfTasks.containsKey(task)) {
			ListOfTasks.put(task, true);
			System.out.println("Status updated");
			System.out.println("--------------------------");

		} else {
			System.out.println("Task Doesn't Exist");
			System.out.println("-------------------------");
		}
	}

	void deleteTask() {
		System.out.println("Please Enter the Task name to Delete");
		String task = sc.next();
		if (ListOfTasks.containsKey(task)) {
			ListOfTasks.remove(task);
			System.out.println("Task deleted successfully");
			System.out.println("---------------------------");

		} else {
			System.out.println("Task Doesn't Exist");
			System.out.println("------------------------");
		}

	}

	void searchATask() {
		System.out.println("Please Enter the Task name to Search");
		String task = sc.next();
		if (ListOfTasks.containsKey(task)) {
			System.out.print(task + " ");
			if (ListOfTasks.get(task) == false) {
				System.out.println("Status : Not Completed");
			} else {
				System.out.println("Status : Completed");
			}

		} else {
			System.out.println("Task Doesn't Exist");
			System.out.println("----------------------------");
		}

	}

}

public class Assignment3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Features features = new Features();
		while (true) {
			{
				System.out.println("Please Enter your choice !");

				System.out.println(
						"1.Add a new task\n2.View all tasks\n3.Mark a task as completed\n4.Delete a task\n5.Search for tasks\n6.Exit");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					features.addNewTask();
					break;

				case 2:
					features.viewAllTasks();
					break;

				case 3:
					features.markAsComplete();
					break;

				case 4:
					features.deleteTask();
					break;

				case 5:
					features.searchATask();
					break;

				case 6:
					System.out.println("Thankyou Please Visit Again");
					System.exit(0);
				default:
					System.out.println("Please Enter a Valid choice :)");
					break;

				}

			}
		}

	}

}
