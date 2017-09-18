/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *
 * @author v.grebenschikov
 */
public class StudentServiceImpl implements StudentService, ApplicationContextAware {
    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        this.context = ac;
    }
    
    public void enrollStudentInCource(Course course, Student student){
        context.publishEvent(new CourseFullEvent(this, course));
    }
}
