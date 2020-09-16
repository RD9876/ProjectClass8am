package org.test;
//Class definition

public class CourseDetails {

	//Method definition
	public void javaCourse() {

		System.out.println("Java course");
	}

	public void oracleCourse() {

		System.out.println("oracle course");

	}

	//Execution will start from main method
	public static void main(String[] args) {

		// Object creation syntax
		// ClassName objName=new ClassName();

		CourseDetails course = new CourseDetails();

		// Method call
		// objname.methodname();
		course.javaCourse();
		course.oracleCourse();

	}

}
