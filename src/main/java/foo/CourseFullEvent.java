/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foo;

import org.springframework.context.ApplicationEvent;

/**
 *
 * @author v.grebenschikov
 */
public class CourseFullEvent extends ApplicationEvent{
    private Course course;

    public Course getCourse() {
        return course;
    }
    
    public CourseFullEvent(Object source, Course course) {
        super(source);
        this.course = course;
    }
    
}
