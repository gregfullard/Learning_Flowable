/**
 * 
 */
package com.softwarehippie.learning.flowable.holidayrequest;

import org.flowable.engine.delegate.DelegateExecution;

/**
 * @author gregf
 *
 */
public class CallExternalSystemDelegate implements org.flowable.engine.delegate.JavaDelegate {

  @Override
  public void execute(DelegateExecution execution) {

    System.out.println("Calling the external system for employee "
        + execution.getVariable("employee"));
    
  }

}
