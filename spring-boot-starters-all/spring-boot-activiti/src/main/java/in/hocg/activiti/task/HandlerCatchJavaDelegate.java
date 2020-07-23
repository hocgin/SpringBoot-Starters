package in.hocg.activiti.task;

import lombok.extern.slf4j.Slf4j;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

/**
 * Created by hocgin on 2019/4/11.
 * email: hocgin@gmail.com
 *
 * @author hocgin
 */
@Slf4j
public class HandlerCatchJavaDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        log.debug("处理捕获的信号");
    }
}
