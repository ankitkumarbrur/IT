package com;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ReverseTag extends SimpleTagSupport {

    private String input;
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
             StringBuilder s = new StringBuilder(input);
            out.println(s.reverse());
            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
            }

        } catch (java.io.IOException ex) {
            throw new JspException("Error in ReverseTag tag", ex);
        }
    }

    public void setInput(String input) {
        this.input = input;
    }
    
}
