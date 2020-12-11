/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MrBean;

import java.beans.IntrospectionException;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author c3
 */
public class StudentBeanInfo extends SimpleBeanInfo {
    @Override
    public PropertyDescriptor[] getPropertyDescriptors()
    {
        try {
            PropertyDescriptor pd1=new PropertyDescriptor("name",Student.class);
            PropertyDescriptor pd2=new PropertyDescriptor("classs",Student.class);
            PropertyDescriptor[] pds = new PropertyDescriptor[]{pd1,pd2};
            return pds;
            

        } catch (IntrospectionException ex) {
            Logger.getLogger(StudentBeanInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
                    return null;
    }
    
    @Override
    public MethodDescriptor[] getMethodDescriptors()
    {
        
        try {
            MethodDescriptor md1=new MethodDescriptor(Student.class.getMethod("getName"));
            MethodDescriptor md2=new MethodDescriptor(Student.class.getMethod("setName",String.class));
            MethodDescriptor md3=new MethodDescriptor(Student.class.getMethod("getClasss"));
            MethodDescriptor md4=new MethodDescriptor(Student.class.getMethod("setClasss",int.class));
            return new MethodDescriptor[]{md1,md2,md3,md4};
        } catch (NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(StudentBeanInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
