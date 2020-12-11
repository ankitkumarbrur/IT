/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MrBean;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;

/**
 *
 * @author c3
 */
public class GetProperties {

    public static void main(String args[]) throws IntrospectionException, ClassNotFoundException {
        
        
        System.out.println("Employee Properties :");
      // Class c=Class.forName("MrBean.Employee");
        BeanInfo beanInfo = Introspector.getBeanInfo(Employee.class);
        PropertyDescriptor[] properties= beanInfo.getPropertyDescriptors();
//        for(PropertyDescriptor pd:properties)
//        {
//            System.out.println(pd.getName());
//        }
//        System.out.println("\n\n\n");
        
        MethodDescriptor[] methods=beanInfo.getMethodDescriptors();
//        for(MethodDescriptor md:methods)
//        {
//            System.out.print(md.getMethod().getReturnType() + "  ");
//            System.out.print(md.getName() + "(");
//            int n = md.getMethod().getParameterCount();
//            for (int i=0; i<n; i++) {
//                System.out.print(md.getMethod().getParameterTypes()[i].getName() + ",");
//            }
//            System.out.println(")");
//        }
        
        
//        System.out.println("\nStudent Properties :");
//       Class c2=Class.forName("MrBean.Student");
//       BeanInfo beanInfo2 = Introspector.getBeanInfo(c2);
//        PropertyDescriptor[] properties2= beanInfo2.getPropertyDescriptors();
//        for(PropertyDescriptor pd:properties2)
//        {
//            System.out.println(pd.getName());
//        }
//        MethodDescriptor[] methods2=beanInfo2.getMethodDescriptors();
//        for(MethodDescriptor md2:methods2)
//        {
//            System.out.println(md2.getName());
//        }
    }
    
}
