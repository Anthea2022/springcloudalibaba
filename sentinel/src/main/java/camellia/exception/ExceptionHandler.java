package camellia.exception;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author anthea
 * @date 2023/10/15 14:51
 */
public class ExceptionHandler {
    public static String globalHandle(BlockException exception) {
        return "exception";
    }
}
