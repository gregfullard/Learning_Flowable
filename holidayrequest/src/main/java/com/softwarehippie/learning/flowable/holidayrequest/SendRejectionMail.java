/**
 * 
 */
package com.softwarehippie.learning.flowable.holidayrequest;

import org.flowable.engine.delegate.DelegateExecution;

/**
 * @author gregf
 *
 */
public class SendRejectionMail implements org.flowable.engine.delegate.JavaDelegate{

  @Override
  public void execute(DelegateExecution execution) {

    System.out.println("Sending email to employee "
        + execution.getVariable("employee"));
    
  }

}
