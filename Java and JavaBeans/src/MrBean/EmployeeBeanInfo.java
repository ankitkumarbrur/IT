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
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author c3
 */
public class EmployeeBeanInfo extends SimpleBeanInfo {
    
    PropertyDescriptor[] pds;
    MethodDescriptor[] mds;
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() 
    {
        try {
            PropertyDescriptor pd1=new PropertyDescriptor("name",Employee.class);
            PropertyDescriptor pd2=new PropertyDescriptor("id",Employee.class);
            pds = new PropertyDescriptor[]{pd1, pd2};
            return pds;
        } catch (IntrospectionException ex) {
            Logger.getLogger(EmployeeBeanInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    @Override
    public MethodDescriptor[] getMethodDescriptors()
    {
        Method[] meth = Employee.class.getDeclaredMethods();
        for(Method mh: meth)
        {
            System.out.println(mh.getName()+" ");
        }
        System.out.println("\n\n\n");
//        int h = Employee.class.;
//        System.out.println(h+ "  ");
//        for(Method mh: meth)
//        {
//            System.out.println(mh.getName()+" ");
//        }
        try
        {
            MethodDescriptor md1=new MethodDescriptor(meth[0]);
            MethodDescriptor md2=new MethodDescriptor(meth[1]);
            MethodDescriptor md3=new MethodDescriptor(meth[2]);
            MethodDescriptor md4=new MethodDescriptor(meth[3]);
            MethodDescriptor md5=new MethodDescriptor(meth[4]);
//            MethodDescriptor md1=new MethodDescriptor(Employee.class.getMethod("getName"));
//            MethodDescriptor md2=new MethodDescriptor(Employee.class.getMethod("setName", String.class));
//            MethodDescriptor md3=new MethodDescriptor(Employee.class.getMethod("getId"));
//            MethodDescriptor md4=new MethodDescriptor(Employee.class.getMethod("setId", int.class));
//            MethodDescriptor md5=new MethodDescriptor(Employee.class.getMethod("sum", int.class,int.class));
            MethodDescriptor[] mds = new MethodDescriptor[]{md1,md2,md3,md4,md5};
            return mds;
        } catch (Exception ex) {
            Logger.getLogger(EmployeeBeanInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
